import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition {
	static final Object monitor = new Object();
	static final AtomicInteger atomicMonitor = new AtomicInteger();
	static int counter = 0;

	public static void increment() {

		for (int i = 0; i <= 20000; i++) {
			atomicMonitor.getAndIncrement();
			counter++;
			System.out.println(counter);

		}
	}

	public static void someFunc() {
		long start = System.currentTimeMillis();

		Thread A = new Thread(new Runnable() {
			@Override
			public void run() {
				increment();
			}
		});

		Thread B = new Thread(new Runnable() {
			@Override
			public void run() {
				increment();
			}

		});
		A.start();
		B.start();
		try {
			A.join();
			B.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();

		System.out.println("Needed time is: ");
		System.out.println(end - start);
	}
}
