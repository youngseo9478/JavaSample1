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
		l1 = new JLabel("Ȧ����");
		l2 = new JLabel("¦����");
		l3 = new JLabel("����");
		t1 = new JTextField("", 40); // ���� 40�� ��, ó���� �ƹ��͵� X
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
			// start��ư�� ������ ������ �����Ǿ�
			// start()�� ���ֱ� ������ NEW���·� ���
			// �������� ������ �����尡 ����Ǹ� TERMINATED���°� �Ǵµ�
			// �ٽ� start��ư�� ������ �����尡 �غ���� ���� ���¿���
			// start()�� �Ϸ��� �ϱ� ����! �׷��� ������ ������ start�ȿ���...
			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ ó���� ���� ������~
				 System.out.println(Thread.currentThread());

				// ������� �ѹ� �����ϸ� ����� �� �Ҹ�
				// �ٽ� ����Ϸ��� ��� ��������¿� �÷�����Ѵ�(�ʱ�ȭ�� ���� ������ ������ ���)
				// �׷��� start()�� ������ �� �ִ�.
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
				f.setVisible(false); // ���� �Ⱥ��̰� ó��
				f.dispose(); // (GUI�۾� �ݳ�)=�ı�
				//exit ó���� �ð��� �� �ɸ����� �־ �ϴ� ���� �Ⱥ��̰� �ϰ� �ı��� �Ŀ� �����Ŵ
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
				try {// sleep�� ���������� �纸�� �ϴ� ���� ����
					Thread.sleep(500); // 1000==1��
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
			// Thread�ȿ� �ִ� getName�޼ҵ� �̿��ϸ� �ȴ�.
			System.out.println(getName());
			for (int i = 2; i <= 100; i += 2) {
				sum += i;
				t2.setText("" + sum);
				try {// sleep�� ���������� �纸�� �ϴ� ���� ����
					Thread.sleep(500); // 1000==1��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			t3.setText(sum + Integer.parseInt(t1.getText()) + "");
			System.out.println("job2 end");
		}
	}
}
