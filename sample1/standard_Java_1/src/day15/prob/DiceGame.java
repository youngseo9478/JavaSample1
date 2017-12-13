package day15.prob;

public class DiceGame {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();

		System.out.println("======================�ֻ��� ���� ���======================");
		int result1 = 0, result2 = 0;
		try {
			result1 = game.countSameEye(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���� ������ 8���� �ֻ��� 2���� ������ ���� ���� ���� Ƚ�� : " + result1);

		System.out.println("========================================================");
		
		try {
			result2 = game.countSameEye(-10);
			System.out.println("���� ������ 8���� �ֻ��� 2���� ������ ���� ���� ���� Ƚ�� : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	int countSameEye(int n) throws Exception {
		if (n < 0) {
			throw new Exception("������ Ƚ���� ������ �� �����ϴ�.");
		}
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (dice1.play() == dice2.play()) {
				count++;
			}
			System.out.println();
		}
		return count;
	}
}

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		System.out.println(getClass().getSimpleName()+" : "+number);
		return number;
	}
}
