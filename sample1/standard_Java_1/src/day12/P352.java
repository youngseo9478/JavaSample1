package day12;

public class P352 {
	public static void main(String[] args) {
		// SingleTone()���� �Ұ�
		// new SingleTone();

		// �̷��Դ� ������ ���� ����
		// �� �ѹ��� �����ϰ� �ȴ�.
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
	}
}

class SingleTone {

	// ���ο����� ������ ���� ����
	private static SingleTone s = new SingleTone();

	// ������ �Լ��� privateó���ϸ� SingleTone�ȿ����� ������������. P352���� �����Ұ�
	private SingleTone() {
		System.out.println("SingleTone() ����");
	}

	public static SingleTone getInstance() {
		return s;
	}
}