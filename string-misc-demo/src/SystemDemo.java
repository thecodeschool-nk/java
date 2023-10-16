
import java.lang.*;
import static java.lang.System.clearProperty;
import static java.lang.System.setProperty;
import java.util.Arrays;
class SystemDemo
{
	public static void main(String args[])
	{
		// checking specific property
		System.out.println(System.getProperty("user.home"));
		
		// clearing this property
		clearProperty("user.home");
		
		System.out.println(System.getProperty("user.home"));
		
		// setting specific property
		setProperty("user.country", "US");
		
		// checking property
		System.out.println(System.getProperty("user.country"));
		
		// checking property other than system property
		// illustrating getProperty(String key, String def)
		System.out.println(System.getProperty("user.password",
			"none of your business"));


		Runtime runtime = Runtime.getRuntime();
		long memory1, memory2;
		Integer integer[] = new Integer[1000];

		// checking the total memory
		System.out.println("Total memory is: "
				+ runtime.totalMemory());

		// checking free memory
		memory1 = runtime.freeMemory();
		System.out.println("Initial free memory: "
				+ memory1);

		// calling the garbage collector on demand
		System.gc();

		memory1 = runtime.freeMemory();

		System.out.println("Free memory after garbage "
				+ "collection: " + memory1);

		// allocating integers
		for (int i = 0; i < 1000; i++)
			integer[i] = new Integer(i);

		memory2 = runtime.freeMemory();
		System.out.println("Free memory after allocation: "
				+ memory2);

		System.out.println("Memory used by allocation: " +
				(memory1 - memory2));

		// discard integers
		for (int i = 0; i < 1000; i++)
			integer[i] = null;

		System.gc();

		memory2 = runtime.freeMemory();
		System.out.println("Free memory after  "
				+ "collecting discarded Integers: " + memory2);

		System.exit(1);

		// this line will not execute as JVM terminated
		System.out.println("JVM terminated");
	}
}
