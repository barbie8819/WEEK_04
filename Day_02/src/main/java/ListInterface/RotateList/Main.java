package ListInterface.RotateList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List Before Rotation :" + list);
        RotateElements.Rotate(list,2);
        System.out.println("List After Rotation :" + list);



    }
}
