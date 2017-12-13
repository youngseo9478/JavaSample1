package thread.awt;

import javax.swing.JFrame;

public class Test01 {
	public static void main(String[] args) {
//		Frame f = new Frame("Sample...");
//		f.setSize(200, 200);
//		//frame의 디폴트는 눈에 보이지 않아서 setVisible에 true해줘야한다
//		f.setVisible(true);
		JFrame jf = new JFrame("Sample_Swing.ver...");
		jf.setSize(300, 300);
		jf.setVisible(true);
		//x버튼으로 종료 가능 ->Frame에서는 이벤트처리로 해줘야하는데 JFrame에서는 간단!
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
