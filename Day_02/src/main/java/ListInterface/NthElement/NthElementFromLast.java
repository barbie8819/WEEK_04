package ListInterface.NthElement;

import java.util.Iterator;
import java.util.List;

public class NthElementFromLast {
    public static Character nthElement(List<Character>list , int n){
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        var first = list.listIterator();
        var second = list.listIterator();

        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

}
