package day13;

//is-a����(��Ӱ���)
public class Circle extends Shape{

	//has-a����(���԰���)
	Point center; //�߽���
	int r; //������
	
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
		System.out.println("�� �׸���");
		super.draw();
	}
}
