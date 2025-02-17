package AnnotationsJava.MaxLength;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalArgumentException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            MaxLength maxLengthAnnotation = field.getAnnotation(MaxLength.class);
            if (maxLengthAnnotation != null) {
                try {
                    field.setAccessible(true);
                    String fieldValue = (String) field.get(obj);
                    if (fieldValue != null && fieldValue.length() > maxLengthAnnotation.value()) {
                        throw new IllegalArgumentException(
                                "Field " + field.getName() + " exceeds max length of " + maxLengthAnnotation.value());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
