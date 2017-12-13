package thread.lab2;

import java.awt.BorderLayout;
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
	JButton start = new JButton("start");
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;

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
		f.add(start,BorderLayout.SOUTH);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Job1 j1 = new Job1();
				Job2 j2 = new Job2();
				Thread job1 =new Thread(j1,"job1");
				Thread job2 = new Thread(j2,"job2");
				
				job1.start();
				job2.start();
				try {
					job1.join();
					job2.join();
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				t3.setText(j1.sum+j2.sum+"");
			}
		});
		
	}
    public static void main(String[] args) {
    	System.out.println(Runtime.getRuntime().freeMemory());
		new Test02();
		System.out.println(Runtime.getRuntime().freeMemory());
	}

class Job1 implements Runnable{
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

class Job2 implements Runnable{
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