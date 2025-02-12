package SetInterface.SymmetricDifference;

import SetInterface.UnionAndIntersection.UnionIntersection;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 =new HashSet<>();
        set2.add(5);
        set2.add(3);
        set2.add(4);
        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);
        HashSet<Integer> symmetric = SymmetricDiff.symmetricDifference(set2,set1);
        System.out.println("Symmetric Difference : " + symmetric);
           }
}
