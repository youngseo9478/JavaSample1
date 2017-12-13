package thread.lab1;

public class Test02 {
	public static void main(String[] args) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("*******  main start *************");
		System.out.println(Thread.currentThread());
		Thread.yield(); // ¹«½Ã
		
		Thread job1 = new Thread(new Job1());
		Thread job2 = new Thread(new Job2());

		job1.start();
		job2.start();
		
		System.out.println("*******  main end *************");
	}
}

class Job1 implements Runnable{
    int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i =1;i<100;i=i+2){
			sum += i;
			System.out.println("1~ "+ i+" È¦¼öÇÕÀº : "+sum);
			//Thread.yield();
		}
	}
}

class Job2 implements Runnable{
    int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i =0;i<100;i=i+2){
			sum += i;
			System.out.println("1~ "+ i+" Â¦¼öÇÕÀº : "+sum);
			//Thread.yield();
		}
	}
}




