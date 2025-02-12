package ListInterface.RemoveDuplicates;

import ListInterface.RotateList.RotateElements;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(50);
        System.out.println("List Before Removing Duplicates :" + list);
        List<Integer>result =  RemovingDuplicates.removeDuplicates(list);
        System.out.println("List After Removing Duplicates :" + result);

    }
}
