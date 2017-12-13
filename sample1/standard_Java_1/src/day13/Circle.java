package day13;

//is-a관계(상속관계)
public class Circle extends Shape{

	//has-a관계(포함관계)
	Point center; //중심점
	int r; //반지름
	
	public Circle() {
		super();
	}

	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	
	public Circle(String color, Point center, int r) {
		super(color);
		this.center = center;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", r=" + r +", color="+getColor()+ "]";
	}

	@Override
	public void draw() {
		System.out.println("원 그리기");
		super.draw();
	}
}
