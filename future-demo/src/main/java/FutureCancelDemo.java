import java.util.concurrent.*;

public class FutureCancelDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Submit a Callable task that simulates a long-running task
        Callable<Integer> longTask = () -> {
            System.out.println("Long task started on thread: " + Thread.currentThread().getName());
            Thread.sleep(5000);  // Simulate a task that takes 5 seconds
            return 99;
        };

        Future<Integer> future = executorService.submit(longTask);

        // Cancel the task after 2 seconds
        Thread.sleep(2000);
        boolean isCancelled = future.cancel(true);  // Attempts to cancel the task
        System.out.println("Task cancelled: " + isCancelled);

        try {
            Integer result = future.get();  // This will throw CancellationException
            System.out.println("Task result: " + result);
        } catch (CancellationException e) {
            System.out.println("Task was cancelled.");
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}
