package JavaRegex.RepeatingWords;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MAin {


    public static Set<String> findRepeatedWords(String text) {
        String[] words = text.split("\\W+");
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]) && i != j) {
                    set.add(words[i]);
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Set<String> repeatedWords = findRepeatedWords(text);
        System.out.println(repeatedWords);
    }
}


