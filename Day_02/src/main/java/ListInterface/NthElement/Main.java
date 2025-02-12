package ListInterface.NthElement;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list =new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println("The list : "+list);
        System.out.println("The element at 2nd from the last : "+ NthElementFromLast.nthElement(list,2));

    }
}
