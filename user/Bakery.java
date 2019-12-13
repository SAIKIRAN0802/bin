public class Bakery extends Thread {

	public int thread_id;
	public static final int countToThis = 200;
	public static final int numberOfThreads = 5;
	public static volatile int count = 0;
	
	private static volatile int[] ticket = new int[numberOfThreads];
	
	public Bakery(int id) {
		this.thread_id = id;
	}
	public void run() {
		for (int i = 0; i < countToThis; i++) {
			lock(thread_id);
				count = count + 1;
				System.out.println("I am " + thread_id + " and count is: " + count);
			unlock(thread_id);
		}
	}
	public void lock(int id) {
		ticket[id] = findMax() + 1;
		for (int j = 0; j < numberOfThreads; j++) {
			while (ticket[j]!= 0 && (ticket[j]<ticket[id])) { }
						 
		} 
	}
	private void unlock(int id) {
		ticket[id] = 0;
	}
	private int findMax() {
		int max= ticket[0];
		for (int i = 1; i < ticket.length; i++) {
			if (ticket[i] > m)
				max= ticket[i];
		}
		return max;
	}

	public static void main(String[] args) {
		for (int i = 0; i < numberOfThreads; i++) {
			ticket[i] = 0;
		}
		Bakery[] threads = new Bakery[numberOfThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Bakery(i);
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("\nCount is: " + count);
		System.out.println("\nExpected was: " + (countToThis * numberOfThreads));
	}

}