package SetInterface.UnionAndIntersection;

import java.util.HashSet;

public class UnionIntersection {
    public static HashSet<Integer> Union (HashSet<Integer> set1,HashSet<Integer> set2){

        HashSet<Integer> result =new HashSet<>(set1);
       result.addAll(set2);
       return result;
    }
    public static HashSet<Integer> Intersection (HashSet<Integer> set1,HashSet<Integer> set2){

        HashSet<Integer> result =new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
