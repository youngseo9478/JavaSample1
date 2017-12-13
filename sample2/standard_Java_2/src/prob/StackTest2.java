package prob;

public class StackTest2 {
	public static void main(String[] args) {
		MyStack2 stack = new MyStack2(10);
		
		Job1 j1 = new Job1(stack);
		Thread job1 = new Thread(j1,"push");
		
		Job2 j2 = new Job2(stack);
		Thread job2 = new Thread(j2,"pop");
		
		job1.start();
		job2.start();
	}
}

class Job1 implements Runnable {
	MyStack2 stack;

	public Job1() {
	}

	public Job1(MyStack2 stack) {
		this.stack = stack;
	}

	public MyStack2 getStack() {
		return stack;
	}

	public void setStack(MyStack2 stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			stack.push(i);
			System.out.println("push => " + i);
		}
	}
}

class Job2 implements Runnable {
	MyStack2 stack;

	public Job2() {
	}

	public Job2(MyStack2 stack) {
		this.stack = stack;
	}

	public MyStack2 getStack() {
		return stack;
	}

	public void setStack(MyStack2 stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = stack.pop();
			System.out.println("pop => " + data);
		}
	}
}

class MyStack2 {
	int[] stack;
	int top = 0;

	public MyStack2() {
		stack = new int[10];
	}

	public synchronized int pop() {
		if (!isEmpty()) {
			int topnum = stack[top - 1];
			stack[top - 1] = 0;
			top--;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return topnum;
		} else {
			return -1;
		}
	}

	public int top() {
		return isEmpty() ? -1 : stack[top - 1];
	}

	public boolean isFull() {
		return top == stack.length ? true : false;
	}

	public boolean isEmpty() {
		return top == 0 ? true : false;
	}

	public synchronized void push(int i) {
		if (0 <= top && top < stack.length) {
			stack[top] = i;
			top++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("stack is full");
			// int[] stack2 = new int[30];
			// System.arraycopy(stack, 0, stack2, 0, stack.length);
			// return;
		}
	}


	public MyStack2(int i) {
		stack = i > 0 ? new int[i] : new int[10];
	}
}