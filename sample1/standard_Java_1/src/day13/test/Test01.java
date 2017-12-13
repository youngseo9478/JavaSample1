package day13.test;

public class Test01 {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw();
		c.drawColor();
		c.calculationArea();

		Shape s = c;
		s.calculationArea();
		System.out.println(c);
		System.out.println(s);

		Drawable d = c;
		d.draw();

		System.out.println("*****************************");
		
		Shape[] ss = { new Circle(), new Rectangle() };
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].calculationArea();
			((Drawable)ss[i]).draw();
			((Colorable)ss[i]).drawColor();
		}
	}
}
