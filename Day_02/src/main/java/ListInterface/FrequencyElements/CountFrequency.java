package ListInterface.FrequencyElements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {
    public static Map<String,Integer> Frequency(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for(String s : list){
            map.put(s, map.getOrDefault(s,0)+1);

        }
        return map;
    }
}
