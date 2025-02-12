package SetInterface.SymmetricDifference;

import java.util.HashSet;

public class SymmetricDiff {
    public static HashSet<Integer> symmetricDifference (HashSet<Integer> set1, HashSet<Integer> set2){

        HashSet<Integer> result =new HashSet<>(set1);
        result.addAll(set2);
        HashSet<Integer> intersection =new HashSet<>(set1);
        intersection.retainAll(set2);
        result.removeAll(intersection);
        return result;
    }
}
