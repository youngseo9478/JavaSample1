package thread.prob1;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		
		Job1 j1 = new Job1(stack);
		Thread job1 = new Thread(j1,"push");
		
		Job2 j2 = new Job2(stack);
		Thread job2 = new Thread(j2,"pop");
		
		job1.start();
		job2.start();
		
		System.out.println("main end");
	}
}

class Job1 implements Runnable{
    MyStack stack;
    
    public Job1(){}
	public Job1(MyStack stack) {
		this.stack = stack;
	}
	public MyStack getStack() {
		return stack;
	}
	public void setStack(MyStack stack) {
		this.stack = stack;
	}
	@Override
	public void run() {
		for(int i =0;i<=10;i++){
		  synchronized (stack) {
			    stack.push(i);
				System.out.println("push(생산자) => "+i);
		  }	
			
			
		}
	}
}

class Job2 implements Runnable{
	MyStack stack;
	public Job2() {	}
	public Job2(MyStack stack) {
		this.stack = stack;
	}
	public MyStack getStack() {
		return stack;
	}
	public void setStack(MyStack stack) {
		this.stack = stack;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			//int data = stack.pop();
			synchronized (stack) {
				
				System.out.printf("pop(소비자) => %d%n",stack.pop());
			}
		}
	}
}






class MyStack{
	int[] stack;
	int top =0;
	
	public MyStack() {
        stack = new int[10];
	}
	public MyStack(int size) {
		if(size < 0){
			stack = new int[10];
		}else{
			stack = new int[size];
		}
	}
	public synchronized boolean isFull() {
        /*if(top == stack.length){
        	return true;
        }else{
        	return false;
        }*/
		return top == stack.length ? true : false ;
	}
	public synchronized boolean isEmpty() {
		return top==0 ? true:false;
	}
	public synchronized int pop(){
		if(isEmpty()){
			//return -1;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int data = stack[--top];
		notifyAll();
		return data;
	}
	
	public synchronized int top(){
		if(isEmpty()){
			return -1;
		}
		return stack[top-1];
	}
	
	public synchronized void push(int data){
		if(isFull()){
			//System.out.println("stack is full... ??");
			//return;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack[top] = data;
		top++;
		notifyAll();
	}
	
}













