package ListInterface.FrequencyElements;
import jdk.jfr.Frequency;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("banana");
        list.add("apple");
        Map<String,Integer> map = CountFrequency.Frequency(list);

        System.out.println("Printing frequency of elements : " + map);
    }
}
