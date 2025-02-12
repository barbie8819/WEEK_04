package SetInterface.UnionAndIntersection;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        HashSet<Integer> set2 =new HashSet<>();
        set2.add(5);
        set2.add(2);
        set2.add(9);
        set2.add(4);
        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);

        HashSet<Integer> Union = UnionIntersection.Union(set2,set1);
        System.out.println("Union : " + Union);
        HashSet<Integer> intersection = UnionIntersection.Intersection(set2,set1);
        System.out.println("Intersection : " + intersection);
    }
}
