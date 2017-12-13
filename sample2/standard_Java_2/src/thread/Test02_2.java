package thread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test02_2 {
	JFrame f = new JFrame("Thread Test");
	JButton start = new JButton("START");
	JButton clear = new JButton("CLEAR");
	JButton exit = new JButton("EXIT");
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	Job1 j1;
	Job2 j2;

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		new Test02_2();
	}

	Test02_2() {
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
		buttons.setBackground(Color.cyan);
		buttons.add(start);
		buttons.add(clear);
		buttons.add(exit);	
		f.add(p1, BorderLayout.NORTH);
		f.add(buttons, BorderLayout.SOUTH);
		f.setSize(300, 200);
		f.setLocation(500, 200);
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
				// 이벤트 처리도 역시 쓰레드~
				 System.out.println(Thread.currentThread());

				// 쓰레드는 한번 수행하면 종료된 후 소멸
				// 다시 사용하려면 계속 실행대기상태에 올려줘야한다(초기화를 새로 수행할 때마다 계속)
				// 그래야 start()를 수행할 수 있다.
				j1 = new Job1("job1");
				j2 = new Job2("job2");
				j1.start();
				j2.start();
			}
		});
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(Thread.currentThread());
				t1.setText("");
				t2.setText("");
				t3.setText("");
				j1.stop();
				j2.stop();
				j1.sum = 0;
				j2.sum = 0;
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(Thread.currentThread());
				f.setVisible(false); // 눈에 안보이게 처리
				f.dispose(); // (GUI작업 반납)=파괴
				//exit 처리가 시간이 꽤 걸릴때가 있어서 일단 눈에 안보이게 하고 파괴한 후에 종료시킴
				System.exit(0);
			}
		});
	}

	class Job1 extends Thread {
		int sum = 0;

		Job1() {
		}

		public Job1(String string) {
			setName(string);
		}

		@Override
		public void run() {
			System.out.println(getName());
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

	class Job2 extends Thread {
		int sum = 0;

		Job2() {
		}

		Job2(String string) {
			setName(string);
		}

		@Override
		public void run() {
			// Thread안에 있는 getName메소드 이용하면 된다.
			System.out.println(getName());
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
