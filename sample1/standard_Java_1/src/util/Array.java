package util;

public class Array {
	public static int[] sort(int[] a) {

		// �Ű������� �ּҰ� �Ա⶧���� read and write ��� ����!
		// �׷��� ������ ���� �����ϱ� ���� a2�� �迭 �����ؼ� ���! 
		int[] a2 = new int[a.length];
		System.arraycopy(a, 0, a2, 0, a.length);

		// sorting
		int temp;
		for (int i = 0; i < a2.length - 1; i++) {
			for (int j = i + 1; j < a2.length; j++) {
				if (a2[i] > a2[j]) {
					temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
			}
		}

		// ������ �����͸� ����
		return a2;
	}
	/**
	 * 
	 * @param a
	 * @param mode true�̸� �������� false�̸� ��������
	 * @return
	 */
	public static int[] sort(int[] a, boolean mode) {
		
		// �Ű������� �ּҰ� �Ա⶧���� read and write ��� ����!
		// �׷��� ������ ���� �����ϱ� ���� a2�� �迭 �����ؼ� ���! 
		int[] a2 = new int[a.length];
		System.arraycopy(a, 0, a2, 0, a.length);
		
		// sorting
		int temp;
		for (int i = 0; i < a2.length - 1; i++) {
			for (int j = i + 1; j < a2.length; j++) {
				if (a2[i] < a2[j]) {
					temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
			}
		}
		
		// ������ �����͸� ����
		return a2;
	}
	public static String[] sort(String[] a) {
		
		// �Ű������� �ּҰ� �Ա⶧���� read and write ��� ����!
		// �׷��� ������ ���� �����ϱ� ���� a2�� �迭 �����ؼ� ���! 
		String[] a2 = new String[a.length];
		System.arraycopy(a, 0, a2, 0, a.length);
		
		// sorting
		String temp;
		for (int i = 0; i < a2.length - 1; i++) {
			for (int j = i + 1; j < a2.length; j++) {
				if (a2[i].charAt(0) > a2[j].charAt(0)) {
					temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
			}
		}
		
		// ������ �����͸� ����
		return a2;
	}
	
	//�迭��±�� �߰����ְ�! (Arrays.toString������)
}
