package QueueInterface.BinaryNumbers;
import java.util.*;
public class GenerateBinary {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            result.add(binary);

            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }
}
