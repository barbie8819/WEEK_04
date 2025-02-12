package ListInterface.ReverseList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverse {
    public static  void reverseLinkedList(LinkedList<Integer> list) {
            int left = 0, right = list.size() - 1;
            while (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }
    }


