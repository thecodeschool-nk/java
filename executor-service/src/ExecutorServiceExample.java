import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        // Fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        // Submit Runnable task
        executorService.submit(() -> {
            System.out.println("Running task on thread: " + Thread.currentThread().getName());
        });

        // Submit Callable task
        executorService.submit(() -> {
            System.out.println("Callable task executed on thread: " + Thread.currentThread().getName());
            return "Task result";
        });

        // Shutdown the executor service
        executorService.shutdown();
    }
}
