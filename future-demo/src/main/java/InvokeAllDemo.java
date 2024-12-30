import java.util.List;
import java.util.concurrent.*;

public class InvokeAllDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit a list of tasks to the executor
        Callable<Integer> task1 = () -> {
            Thread.sleep(1000);
            return 1;
        };
        Callable<Integer> task2 = () -> {
            Thread.sleep(2000);
            return 2;
        };
        Callable<Integer> task3 = () -> {
            Thread.sleep(1500);
            return 3;
        };

        List<Callable<Integer>> tasks = List.of(task1, task2, task3);

        // Use invokeAll() to submit and get results for all tasks
        List<Future<Integer>> futures = executorService.invokeAll(tasks);

        for (Future<Integer> future : futures) {
            System.out.println("Task result: " + future.get());
        }

        executorService.shutdown();
    }
}
