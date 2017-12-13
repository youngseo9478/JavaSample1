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
	// ����� ���ÿ� �ʱ�ȭ => ������� �ʱ�ȭ
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
		buttons.add(start);
		buttons.add(clear);
		f.add(p1, BorderLayout.NORTH);
		f.add(buttons, BorderLayout.SOUTH);
		f.setSize(500, 500);
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

	// inner class�� �ٲ��ָ� t1.�� ��������
	class Job1 implements Runnable {
		int sum = 0;

		@Override
		public void run() {
			System.out.println(Thread.currentThread());
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

	class Job2 implements Runnable {
		int sum = 0;

		@Override
		public void run() {
			//���ʺ��� �����ؼ� run()�ۿ� ����. ������ Ŭ������ getName�� ȣ���Ϸ��� 
			//Thread.currentThread().getName()�ؾ��Ѵ�...
			System.out.println(Thread.currentThread());
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