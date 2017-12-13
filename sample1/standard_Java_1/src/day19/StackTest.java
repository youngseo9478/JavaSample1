package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i <= 77; i++) {
			stack.push(""+i); //�⺻���� ��ü(Integer)�� �˾Ƽ� �ٲ��ش� : ����ڽ�
		}
		System.out.println(stack.pop());
		
		//Queue�� Interface�� ��ü�����Ұ� -> �ڽ��� �̿��� ����
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= 77; i++) {
			queue.offer(i); //�⺻���� ��ü(Integer)�� �˾Ƽ� �ٲ��ش� : ����ڽ�
		}
		System.out.println(queue.poll());
	}
}
