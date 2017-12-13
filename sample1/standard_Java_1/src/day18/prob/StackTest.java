package day18.prob;

import java.util.ArrayList;
import java.util.List;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
		}

		for (int i = 1; i <= 10; i++) {
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
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack {
	private int size = 0;
	List<Integer> stack = new ArrayList<Integer>(size);
	int count = 0;

	public MyStack() {
		setSize(10);
	}

	public MyStack(int size) {
		if (size > 0) {
			setSize(size);
		} else {
			setSize(10);
		}
	}

	public void push(int i) {
		if (count < size) {
			stack.add(i);
			count++;
		}else{
			isFull();
			System.out.println("stack is Full");
		}
	}

	public int top() {
		return stack.get(count - 1);
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			int topnum = stack.get(count - 1);
			stack.remove(count - 1);
			count--;
			return topnum;
		}
	}

	public boolean isFull() {
		if (stack.size() == count) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
