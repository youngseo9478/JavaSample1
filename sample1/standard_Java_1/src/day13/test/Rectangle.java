package day13.test;

public class Rectangle extends Shape implements Drawable, Colorable{

	@Override
	public void drawColor() {
		System.out.println( getClass().getSimpleName()+"��/�� ��ĥ�մϴ�.");	
	}

	@Override
	public void draw() {
		System.out.println( getClass().getSimpleName()+"��/�� �׸��ϴ�.");	
	}

	@Override
	public void calculationArea() {
		System.out.println( getClass().getSimpleName()+"�� ������ ����մϴ�.");	
	}

}
