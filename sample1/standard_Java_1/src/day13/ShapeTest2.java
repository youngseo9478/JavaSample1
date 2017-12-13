package day13;

public class ShapeTest2 {
	
	public static void main(String[] args) {
		
		Point[] p = { new Point(10,10),
				new Point(10,20),
				new Point(20,10),
				new Point(20,20)
				};
		
		Rectangle r = new Rectangle("BLUE",p);
		System.out.println(r);
		
		System.out.println(r.width);
		System.out.println(r.height);
	}
	
}
