package day13.test;

public class Circle extends Shape implements Drawable, Colorable {

	@Override
	public void draw() {
		System.out.println( getClass().getSimpleName()+"을/를 그립니다.");				
	}

	@Override
	public void calculationArea() {
		System.out.println( getClass().getSimpleName()+"의 면적을 계산합니다.");
	}

	@Override
	public void drawColor() {
		System.out.println( getClass().getSimpleName()+"을/를 색칠합니다.");		
	}

}
