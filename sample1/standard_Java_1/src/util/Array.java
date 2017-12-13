package util;

public class Array {
	public static int[] sort(int[] a) {

		// 매개변수로 주소가 왔기때문에 read and write 모두 가능!
		// 그렇기 때문에 원본 보존하기 위해 a2에 배열 복사해서 사용! 
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

		// 정렬한 데이터를 리턴
		return a2;
	}
	/**
	 * 
	 * @param a
	 * @param mode true이면 오름차순 false이면 내림차순
	 * @return
	 */
	public static int[] sort(int[] a, boolean mode) {
		
		// 매개변수로 주소가 왔기때문에 read and write 모두 가능!
		// 그렇기 때문에 원본 보존하기 위해 a2에 배열 복사해서 사용! 
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
		
		// 정렬한 데이터를 리턴
		return a2;
	}
	public static String[] sort(String[] a) {
		
		// 매개변수로 주소가 왔기때문에 read and write 모두 가능!
		// 그렇기 때문에 원본 보존하기 위해 a2에 배열 복사해서 사용! 
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
		
		// 정렬한 데이터를 리턴
		return a2;
	}
	
	//배열출력기능 추가해주것! (Arrays.toString같은것)
}
