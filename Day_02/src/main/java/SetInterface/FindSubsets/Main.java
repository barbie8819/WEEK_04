package SetInterface.FindSubsets;

import SetInterface.SymmetricDifference.SymmetricDiff;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet<>();
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 =new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(2);
        set2.add(4);

        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);
        System.out.println("is set1 subset of set2 ?  : " + SubsetFinder.isSubset(set1,set2));

    }
}
