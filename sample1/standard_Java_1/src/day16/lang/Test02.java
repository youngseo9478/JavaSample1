package day16.lang;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] num = {77,85,69};
		int[] num2 = num.clone();
		
		System.out.println("_____________________________");
		//�����Ǿ����� �� �� ����
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		
		//�ּҴ� �ٸ�
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println("_____________________________");
		String[] str = {"ȫ�浿","��浿","�̱浿"};
		String[] str2 = str.clone();
		str[0]="~~~~"; //���� ������ �������� �� �� �ִ�.
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
		
		System.out.println(str);
		System.out.println(str2);
		
	}
}
