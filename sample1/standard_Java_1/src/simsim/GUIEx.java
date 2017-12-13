package simsim;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx {
	JFrame frame = new JFrame("ぞぞぞ");
	JButton button = new JButton("せせせ");
//	Panel p = new Panel();
	
	public void createFrame() {
		frame.setSize(500, 500);
		frame.add(button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		GUIEx gui = new GUIEx();
		gui.createFrame();
	}
}
