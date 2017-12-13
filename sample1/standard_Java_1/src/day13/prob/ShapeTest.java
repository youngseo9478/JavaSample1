package day13.prob;

public class ShapeTest {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(5, 6);
		RectTriangle rectTriangle = new RectTriangle(6, 2);

		// �θ�Ÿ�� �迭�� ���� ������ �� ��ü ���
		Shape[] shapes = { rectangle, rectTriangle };

		// shapes �迭�� ��� ��ü���� ���� ���� ���ؼ� ���
		for (int i = 0; i < shapes.length; i++) {
			System.out.printf("area : %.1f%n", shapes[i].getArea());
			// ������¡�� ������ ��ü�� new area�� �ѹ� �� ���ؼ� ���
			if (shapes[i] instanceof Resizable) {
				((Resizable) shapes[i]).resize(0.5);
				System.out.printf("new area : %.1f%n", shapes[i].getArea());
			}
		}
	}
}
