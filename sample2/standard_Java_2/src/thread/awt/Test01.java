package thread.awt;

import javax.swing.JFrame;

public class Test01 {
	public static void main(String[] args) {
//		Frame f = new Frame("Sample...");
//		f.setSize(200, 200);
//		//frame�� ����Ʈ�� ���� ������ �ʾƼ� setVisible�� true������Ѵ�
//		f.setVisible(true);
		JFrame jf = new JFrame("Sample_Swing.ver...");
		jf.setSize(300, 300);
		jf.setVisible(true);
		//x��ư���� ���� ���� ->Frame������ �̺�Ʈó���� ������ϴµ� JFrame������ ����!
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
