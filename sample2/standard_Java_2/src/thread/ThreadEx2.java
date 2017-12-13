package thread;

public class ThreadEx2 {
	public static void main(String[] args) {
		try {//sleep은 무조건적인 양보라서 일단 블럭에 갇힘
			Thread.sleep(1000); //1000==1초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main start");
		//Thread.yield(); //실행대기상태에 아무것도 없어서 그냥 무시
		Thread job1 = new Thread(new Job1());
		Thread job2 = new Thread(new Job2());
		job1.start();
		job2.start();
		System.out.println("main end");
	}
}

class Job1 implements Runnable {
	int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 1; i <= 100; i = i + 2) {
			sum += i;
			System.out.println("1~"+i+"까지의 홀수합은 : "+sum);
			//Thread.yield();
		}
	}
}

class Job2 implements Runnable {
	int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 100; i+=2) {
			sum+=i;
			System.out.println("1~"+i+"까지의 짝수합은 : "+sum);
			//Thread.yield();
		}
	}
}