package day7;

import java.util.Arrays;

public class Student {
	String name;
	int[] score = new int[3];
	double sum;
	double avg;

	public void process() {
		sum=0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
	}

	void naming(String name) {
		this.name = name;
	}

	void score(int[] score) {
		this.score = score;
	}
	public void display(){
		System.out.println("==================성적표==================");
		System.out.println("이름 : "+name);
		System.out.println("성적 : "+Arrays.toString(score));
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("==========================================");
	}
}
