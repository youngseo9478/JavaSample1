package thread;

public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(Thread.currentThread());
		
		Job1 j1 = new Job1();
		Job2 j2 = new Job2();
		
		Thread job1 = new Thread(j1,"job1"); //job1이라는 이름의 쓰레드
		Thread job2 = new Thread(j2,"job2"); //job2이라는 이름의 쓰레드
		
		job1.start();
		job2.start();
		
		//메인이 끝나기 전에 잡1,2가 모두 수행되는것이 아니기떄문에 원하는 값이 안나옴
		//1.메인에 슬립을 건다 => 끝나는 시간을 정확히 알 수 없음
		//2.조인 메소드를 쓴다 => 종료되면 조인을 호출한 쓰레드로 되돌아와 계속 실행.
		// 	조인은 주소를 필요로 한다. 
		try {
			//job1,2가 끝나기 전까지 메인은 블락상태
			job1.join();
			job2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("홀수합+짝수합 = "+(j1.sum+j2.sum));
		
		System.out.println("main end");
	}
}
