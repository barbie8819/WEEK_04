package ListInterface.ReverseList;

import java.util.List;

public class ArrayListReverse {
    public static  void reverseArrayList(List<Integer> list) {
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
