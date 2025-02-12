package ListInterface.RotateList;

import ListInterface.ReverseList.Reverse;

import java.util.Arrays;
import java.util.List;

public class RotateElements {
    public static void Reverse(List<Integer>list,int left,int right){
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void Rotate(List<Integer>list,int i){
        i=i%list.size();
        Reverse(list,0,i-1);
        Reverse(list,i,list.size()-1);
        Reverse(list,0,list.size()-1);
    }
}
