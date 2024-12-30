import java.util.concurrent.*;

public class FutureTimeoutDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit a Callable task that will simulate a long-running task
        Callable<Integer> longTask = () -> {
            System.out.println("Long task is running on thread: " + Thread.currentThread().getName());
            Thread.sleep(3000);  // Simulate a task that takes 3 seconds
            return 42;
        };

        Future<Integer> future = executorService.submit(longTask);

        try {
            // Attempt to get the result, with a 2-second timeout
            Integer result = future.get(2, TimeUnit.SECONDS);  // This will throw TimeoutException
            System.out.println("Task completed with result: " + result);
        } catch (TimeoutException e) {
            System.out.println("Task timed out!");
        } catch (ExecutionException e) {
            System.out.println("Task execution failed: " + e.getMessage());
        } finally {
            // Shutdown the executor service
            executorService.shutdown();
        }
    }
}
