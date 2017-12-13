//����δԲ�(�����)
public class StackTest {
	public static void main(String[] args) {
		System.out.println("Main Start");
		MyStack stack = new MyStack(10);
		Job1 j1 = new Job1(stack);
		Job1 j2 = new Job1(stack);
		Thread job1 = new Thread(j1,"j1 Thread");
		Thread job2 = new Thread(j2,"j2 Thread");
		job1.start();
		job2.start();
		
		System.out.println("Main End");
	}
}
class Job1 implements Runnable{
	MyStack stack;
	public Job1(){};
	public Job1(MyStack stack){
		this.stack = stack;
	}
	@Override
	synchronized public void run() {
		for(int i=0; i<25;i++){
			int k=((int)(Math.random()*9)+1);
			switch(k){
			case 1:	case 2:
				stack.top();
				break;
			case 3: case 4: case 5:
				stack.pop();
				break;
			case 6: case 7: case 8:
				stack.push((int)(Math.random()*10+1));
				break;

			case 9:
				stack.print();
				break;
			}
			System.out.println();
		}
		
		
		
		
	}
}


class MyStack {
	int top;
	int[] stack = null;
	public MyStack() {
		stack = new int[10];
	}
	
	public MyStack(int size){
		if(size<0){
			stack = new int[10];
		}
		else
			stack = new int[size];
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public boolean isFull(){
		return top==stack.length;
	}
	
	synchronized public void pop(){
		if(isEmpty()){
			System.out.println("���� �����Ͱ� �����ϴ�." + "\t\t--->\t" + Thread.currentThread());
			return;
		}
		else{
			top--;
			System.out.println("�ֻ������� ���� ���� : " + stack[top] + "\t--->\t" + Thread.currentThread());
		}
		
	}
	
	synchronized public void top(){
		if(isEmpty()){
			System.out.println("������ ����ֽ��ϴ�." + "\t\t--->\t" + Thread.currentThread());
			return;
		}
		else
			System.out.println("�ֻ��� ���� : " + stack[top-1] +  "\t\t--->\t" + Thread.currentThread());
	}
	
	synchronized public void push(int data){
		if(isFull()){
			System.out.println("������ ����� �� á���ϴ�." + "\t--->\t" + Thread.currentThread());
			return;
		}
		System.out.println(data + "�� ����־����ϴ�." + "\t\t--->\t" + Thread.currentThread());
		stack[top] = data;
		top++;
	}
	
	synchronized public void print(){
		System.out.println("=== Stack List === " + "\t--->\t" + Thread.currentThread());
		for (int i = top-1; i >=0 ; i--) {
			int num = stack[i];
			if (num != -1)
				System.out.println(num + "\t\t\t--->\t" + Thread.currentThread());
		}
	}
	
}









