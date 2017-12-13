package thread.prob;

import javax.swing.JOptionPane;
//입력 대기 상태 동안 다른 쓰레드는 정지 상태
public class P736 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 "+input+" 입니다.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(Thread.currentThread());
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
