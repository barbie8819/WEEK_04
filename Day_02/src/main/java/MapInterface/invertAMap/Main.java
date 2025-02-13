package MapInterface.invertAMap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);
        System.out.println("Original map : "+ inputMap);
        System.out.println("Inverted Map: " + InvertMap.invertMap(inputMap));
    }
}
