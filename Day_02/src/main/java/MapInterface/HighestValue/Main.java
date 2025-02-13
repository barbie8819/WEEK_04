package MapInterface.HighestValue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);
        System.out.println("Map : "+ inputMap);
        System.out.println("Key with the highest value: " + HighestValueKey.findMaxKey(inputMap));
    }
}
