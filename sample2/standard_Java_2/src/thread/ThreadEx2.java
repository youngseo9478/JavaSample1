package thread;

public class ThreadEx2 {
	public static void main(String[] args) {
		try {//sleep�� ���������� �纸�� �ϴ� ���� ����
			Thread.sleep(1000); //1000==1��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main start");
		//Thread.yield(); //��������¿� �ƹ��͵� ��� �׳� ����
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
			System.out.println("1~"+i+"������ Ȧ������ : "+sum);
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
			System.out.println("1~"+i+"������ ¦������ : "+sum);
			//Thread.yield();
		}
	}
}