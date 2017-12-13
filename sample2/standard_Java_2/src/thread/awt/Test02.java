package thread.awt;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test02 {
	// 선언과 동시에 초기화 => 명시적인 초기화
	JFrame f = new JFrame("Thread Test");
	JButton start = new JButton("start");
	JButton clear = new JButton("Clear");
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	Job1 j1 = new Job1();
	Job2 j2 = new Job2();
	Thread job1;
	Thread job2;

	public static void main(String[] args) {
		new Test02();
	}

	Test02() {
		l1 = new JLabel("홀수합");
		l2 = new JLabel("짝수합");
		l3 = new JLabel("총합");
		t1 = new JTextField("", 40); // 문자 40개 들어감, 처음에 아무것도 X
		t2 = new JTextField("", 40);
		t3 = new JTextField("", 40);

		JPanel p1 = new JPanel();
		JPanel buttons = new JPanel();
		p1.setLayout(new GridLayout(3, 2));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		buttons.add(start);
		buttons.add(clear);
		f.add(p1, BorderLayout.NORTH);
		f.add(buttons, BorderLayout.SOUTH);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.addActionListener(new ActionListener() {
			// start버튼을 누르면 쓰레드 생성되어
			// start()를 해주기 전까지 NEW상태로 대기
			// 오류났던 이유는 스레드가 종료되면 TERMINATED상태가 되는데
			// 다시 start버튼을 누를때 스레드가 준비되지 않은 상태에서
			// start()를 하려고 하기 떄문! 그래서 스레드 생성도 start안에서...
			@Override
			public void actionPerformed(ActionEvent e) {
				job1 = new Thread(j1, "job1");
				job2 = new Thread(j2, "job2");
				job1.start();
				job2.start();
			}
		});
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				job1.stop();
				job2.stop();
				j1.sum=0;
				j2.sum=0;
			}
		});

	}

	// inner class로 바꿔주면 t1.이 가능해짐
	class Job1 implements Runnable {
		int sum = 0;

		@Override
		public void run() {
			System.out.println(Thread.currentThread());
			for (int i = 1; i <= 100; i = i + 2) {
				sum += i;
				t1.setText("" + sum);
				try {// sleep은 무조건적인 양보라서 일단 블럭에 갇힘
					Thread.sleep(500); // 1000==1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("job1 end");
		}
	}

	class Job2 implements Runnable {
		int sum = 0;

		@Override
		public void run() {
			//러너블을 구현해서 run()밖에 없다. 쓰레드 클래스의 getName을 호출하려면 
			//Thread.currentThread().getName()해야한다...
			System.out.println(Thread.currentThread());
			for (int i = 2; i <= 100; i += 2) {
				sum += i;
				t2.setText("" + sum);
				try {// sleep은 무조건적인 양보라서 일단 블럭에 갇힘
					Thread.sleep(500); // 1000==1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			t3.setText(sum + Integer.parseInt(t1.getText()) + "");
			System.out.println("job2 end");
		}
	}
}