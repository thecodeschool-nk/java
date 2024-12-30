import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create an ExecutorService with a fixed thread pool of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit a Callable task that will return a result
        Callable<Integer> task1 = () -> {
            System.out.println("Task 1 is running on thread: " + Thread.currentThread().getName());
            Thread.sleep(2000);  // Simulate a long-running task
            return 123;
        };

        // Submit another Callable task
        Callable<Integer> task2 = () -> {
            System.out.println("Task 2 is running on thread: " + Thread.currentThread().getName());
            Thread.sleep(1000);  // Simulate a shorter task
            return 456;
        };

        // Get the Future objects
        Future<Integer> future1 = executorService.submit(task1);
        Future<Integer> future2 = executorService.submit(task2);

        // Wait for and retrieve the results of the tasks
        System.out.println("Result of Task 1: " + future1.get());  // Blocks until task1 is done
        System.out.println("Result of Task 2: " + future2.get());  // Blocks until task2 is done

        // Shutdown the executor service
        executorService.shutdown();
    }
}
