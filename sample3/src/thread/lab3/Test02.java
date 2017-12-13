package thread.lab3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test02 {
	JFrame f = new JFrame("Thread Test");
	JButton start = new JButton("Start");
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton clear = new JButton("Clear");
	JButton exit = new JButton("Á¾ ·á");

	Test02() {
		l1 = new JLabel("È¦¼öÇÕ");
		l2 = new JLabel("Â¦¼öÇÕ");
		l3 = new JLabel("ÃÑ  ÇÕ");
		t1 = new JTextField("",40);
		t2 = new JTextField("",40);
		t3 = new JTextField("",40);
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(3, 2));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		f.add(p1,BorderLayout.NORTH);
		
		Panel p2 = new Panel();
		p2.add(start);
		p2.add(clear);
		p2.add(exit);
		f.add(p2,BorderLayout.SOUTH);
		p2.setBackground(Color.cyan);
		
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(Thread.currentThread());

				Job1 job1 = new Job1("job1");
				Job2 job2 = new Job2("job2");
				//Thread job1 =new Thread(j1,"job1");
				//Thread job2 = new Thread(j2,"job2");
				
				job1.start();
				job2.start();
				try {
					job1.join();
					job2.join();
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				t3.setText(job1.sum+job2.sum+"");
			}
		});
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(Thread.currentThread());

				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(Thread.currentThread());

				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		
	}
    public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		new Test02();
	}

class Job1 extends Thread{
	
	Job1(){}
	Job1(String name){
		super(name);
	}
	
	
    int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i =1;i<5000;i=i+2){
			sum += i;
			//System.out.println("1~ "+ i+" È¦¼öÇÕÀº : "+sum);
			t1.setText("È¦¼öÇÕÀº : "+sum);
			//Thread.yield();
		}
	}
}

class Job2 extends Thread{
	Job2(){}
	Job2(String name){
		super(name);
	}
	
    int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i =0;i<5000;i=i+2){
			sum += i;
			//System.out.println("1~ "+ i+" Â¦¼öÇÕÀº : "+sum);
			t2.setText("Â¦¼öÇÕÀº : "+sum);
			//Thread.yield();
		}
	}
}
}