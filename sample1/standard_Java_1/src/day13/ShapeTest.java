package day13;

public class ShapeTest {
	public static void main(String[] args) {
		
		Point p1 = new Point(10, 10);
		
		Circle c1 = new Circle("Red", p1, 3);
		
		System.out.println(c1);
		
		c1.draw();
		((Shape)c1).draw(); //���ٰ� �Ȱ��� �۵���(�޼ҵ� �������̵��߱⶧��)
		
		Object obj = c1;
		System.out.println(obj); //toString�� �������̵��Ǿ��ֱ⶧����..Circleó������
		//toString, equals�޼ҵ�� ObjectŸ���� �޼ҵ��̹Ƿ� ���Ŀ� �������̵��Ǹ� 
		//���� �ۼ��� ���˴�� ��µȴ�.
	}
}
