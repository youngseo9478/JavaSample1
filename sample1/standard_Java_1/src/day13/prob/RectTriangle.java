package day13.prob;

public class RectTriangle extends Shape {
	double width;
	double height;

	/**
	 * �����ﰢ���� �غ��� ���̸� �ʱ�ȭ�ϴ� ������
	 * 
	 * @param width
	 * @param height
	 */
	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	/**
	 * �����ﰢ���� ���̸� ���ϴ� �޼ҵ�
	 */
	@Override
	double getArea() {
		return width * height * (0.5);
	}

}
