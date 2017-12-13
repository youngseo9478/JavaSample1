package thread.lab1;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("*** main start ***");
		System.out.println(Thread.currentThread());

		Job1 j1 = new Job1();
		Job2 j2 = new Job2();

		Thread job1 = new Thread(j1, "job1");
		Thread job2 = new Thread(j2, "job2");
		job1.start();
		job2.start();
		
		try {
			job1.join();
			job2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		

		System.out.println("ШІМіЧе+ТІМіЧе" + (j1.sum + j2.sum));

		System.out.println("*** main end ***");
	}
}
