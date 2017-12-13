package thread.prob;

import java.util.ArrayList;
import java.util.List;

public class StackTest2 {
	public static void main(String[] args) {
		Data data = new Data(10);
		Pop1 pop1 = new Pop1(data);
		Push1 push1 = new Push1(data);
		Thread pop = new Thread(pop1, "pop");
		Thread push = new Thread(push1, "push");
		push.start();
		pop.start();
	}
}

class Data {
	private int size = 0;
	List<Integer> stack = new ArrayList<Integer>(size);
	int top = 0;

	public Data() {
		setSize(10);
	}

	public Data(int i) {
		setSize(i > 0 ? i : 10);
	}

	public synchronized void push(int i) {
		if (isFull()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack.add(i);
		System.out.println("push : " + i);
		top++;
		notifyAll();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void pop() {
		if (isEmpty()) { // 비어있지 않다면 계속 pop가능
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int data = stack.get(top - 1);
		System.out.println("pop : " + data);
		stack.remove(top - 1);
		top--;
		notifyAll();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int top() {
		return stack.get(top - 1);
	}

	public synchronized boolean isFull() {
		if (top == size) {
			System.out.println("stack is Full!");
			return true;
		} else {
			return false;
		}
	}

	public synchronized boolean isEmpty() {
		if (top == 0) {
			System.out.println("stack is empty!");
			return true;
		} else {
			return false;
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

class Pop1 implements Runnable {
	Data data;

	Pop1() {
	}

	Pop1(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			data.pop();
		}
	}
}

class Push1 implements Runnable {
	Data data;

	Push1() {
	}

	Push1(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int j = 1; j <= 12; j++) {
			data.push(j);
		}
	}
}