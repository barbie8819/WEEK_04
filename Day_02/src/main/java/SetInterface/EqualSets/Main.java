package SetInterface.EqualSets;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        HashSet<Integer> set2= new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        System.out.println("set one elements : "+set);
        System.out.println("set two elements : " + set2);
        System.out.println("Both set are equal ? "+set.equals(set2) );
    }
}
