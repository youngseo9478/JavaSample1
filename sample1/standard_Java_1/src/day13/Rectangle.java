package day13;

import java.util.Arrays;

public class Rectangle extends Shape{
	
	Point[] p = new Point[4];
	int width;
	int height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Point[] p) {
		super();
		this.p = p;
		this.width=p[3].getY()-p[0].getY();
		this.height=p[3].getX()-p[0].getX();
	}

	public Rectangle(String color, Point[] p) {
		super(color);
		this.p = p;
		this.width=p[3].getY()-p[0].getY();
		this.height=p[3].getX()-p[0].getX();
	}

	@Override
	public String toString() {
		return "Rectangle [p=" + Arrays.toString(p) + ",\nwidth=" + width + ", height=" + height +", color="+getColor()+ "]";
	}
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
		super.draw();
	}
	
}
