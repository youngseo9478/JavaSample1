package day18.prob;

public class StackTest2 {
	public static void main(String[] args) {
		MyStack2 stack = new MyStack2(10);
		if (stack.isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
		}

		for (int i = 1; i <= 20; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("������ ���� á���ϴ�.");
		}

		System.out.println("�ֻ��� ���� : " + stack.top());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("");
		System.out.println("== ���� ����Ʈ ==");
		for (int i = 1; i <= 20; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack2 {
	int[] stack;
	int top = 0;

	public MyStack2() {
		stack = new int[10];
	}

	public int pop() {
		if (!isEmpty()) {
			int topnum = stack[top - 1];
			stack[top - 1] = 0;
			top--;
			return topnum;
		} else {
			return -1;
		}
	}

	public int top() {
		return isEmpty()?-1:stack[top - 1];
	}

	public boolean isFull() {
		return top==stack.length?true:false;
	}

	public void push(int i) {
		if (0<=top&&top < stack.length) {
			stack[top] = i;
			top++;
		} else {
//			System.out.println("stack is full");
			int[] stack2 = new int[30];
			System.arraycopy(stack, 0, stack2, 0, stack.length);
			return;
		}
	}

	public boolean isEmpty() {
		return top==0?true:false;
	}

	public MyStack2(int i) {
		stack=i>0?new int[i]:new int[10];
	}
}