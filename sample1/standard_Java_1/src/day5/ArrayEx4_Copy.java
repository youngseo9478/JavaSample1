package day5;

import java.util.Arrays;

public class ArrayEx4_Copy {
	public static void main(String[] args) {
		int[] src = { 66, 77, 88, 67, 54, 33 };
		// �̷��� �����ϰ��� ������¡�� �ȵ�
		// ��ū������ ���ϸ� ��ū�迭������ �����ؼ� ����ؾ��Ѵ�
		System.out.println(Arrays.toString(src));

		int[] dest=new int[src.length*2];
		
		System.arraycopy(src, 0, dest, src.length, src.length);
		System.out.println(Arrays.toString(dest));
		
	}
}
