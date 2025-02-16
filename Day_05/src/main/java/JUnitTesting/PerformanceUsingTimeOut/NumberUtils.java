package JUnitTesting.PerformanceUsingTimeOut;

public class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void longRunningTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
