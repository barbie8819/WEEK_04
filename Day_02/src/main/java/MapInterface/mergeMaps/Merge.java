package MapInterface.mergeMaps;
import java.util.*;
public class Merge {
    public static Map<String, Integer> mergeTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.put(entry.getKey(), map1.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }


        return mergedMap;
    }
}
