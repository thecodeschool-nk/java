## Java Future Demo
The Future interface in Java represents the result of an asynchronous computation. It allows you to check the status of a task, cancel it, and retrieve the result once it completes. Future is typically used in conjunction with an ExecutorService to handle asynchronous tasks in concurrent programming.

### Key Methods in Future:
get(): Blocks the calling thread until the task completes, and returns the result.
cancel(): Attempts to cancel the execution of the task.
isDone(): Checks if the task has completed.
isCancelled(): Checks if the task was canceled before completion.
get(long timeout, TimeUnit unit): Waits for the task to complete within the given timeout.
In this demo, we’ll demonstrate how to submit tasks using an ExecutorService and work with Future to get the result of the computation.