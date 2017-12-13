package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i <= 77; i++) {
			stack.push(""+i); //기본형을 객체(Integer)로 알아서 바꿔준다 : 오토박싱
		}
		System.out.println(stack.pop());
		
		//Queue는 Interface라서 객체생성불가 -> 자식을 이용해 생성
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= 77; i++) {
			queue.offer(i); //기본형을 객체(Integer)로 알아서 바꿔준다 : 오토박싱
		}
		System.out.println(queue.poll());
	}
}
