package ListInterface.ReverseList;
import java.util.*;
public class Reverse {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println("Printing ArrayList : ");
        System.out.println(list);

        System.out.println("Printing Reverse ArrayList : ");
        ArrayListReverse.reverseArrayList(list);
        System.out.println(list);
        LinkedList<Integer> LinkedList = new LinkedList<>();
        LinkedList.add(4);
        LinkedList.add(8);
        LinkedList.add(1);
        LinkedList.add(3);
        LinkedList.add(2);
        System.out.println("Printing LinkedList : ");
        System.out.println(LinkedList);

        System.out.println("Printing Reverse LinkedList : ");
        ArrayListReverse.reverseArrayList(LinkedList);
        System.out.println(LinkedList);
    }
}
