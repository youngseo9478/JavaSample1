package thread.prob;

import javax.swing.JOptionPane;
//�Է� ��� ���� ���� �ٸ� ������� ���� ����
public class P736 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� "+input+" �Դϴ�.");
		
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
