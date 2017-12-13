package day17;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514_StringTokenizer {
	public static void main(String[] args) {
		String msg = "ȫ�浿: 90/80/70";
		// �����ڰ� �� ������..? split���� �ڸ��ԵǸ� �ι��� ���ļ� �߶������
		String[] data = msg.split(":");
		System.out.println(Arrays.toString(data)); // [ȫ�浿, 90/80/70]
		String[] data2 = msg.split("/");
		System.out.println(Arrays.toString(data2)); // [ȫ�浿: 90, 80, 70]

		// data�� �������� ������ �ٽ� �����ַ���
		String[] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu)); // [ 90, 80, 70]
		
		System.out.println();
		System.out.println("____________StringTokenizer_____________");
		StringTokenizer st = new StringTokenizer(msg, ":/"); //�Ű������� �߰��ؼ� true�� �־��ָ� �����ڵ� �ɰ��ִ� ��
		System.out.println("��� �ɰ�����? "+st.countTokens());
		System.out.println();
		//��ū�� ������ �ִ� ���� while 
		while(st.hasMoreTokens()){
			String s = st.nextToken().trim();
			System.out.println(s);
		}
		
	}
}
