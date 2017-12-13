package day16.lang;

public class Test04 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(5, 5), 3);
		System.out.println(c1);

		Circle c2 = c1.clone();
//		c1.setP(new Point(6, 6)); 이렇게하면 Point가 c1,c2 모두 다르게 되는데..아래처럼하면 같ㅇ ㅣ변경됨 그래서 clone을 point도 해줘야함
		 c1.p.setX(99);
		System.out.println(c1);
		System.out.println(c2);
	}
}

class Circle implements Cloneable {
	Point p;
	double r;

	public Circle() {
		super();
	}

	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}

	@Override
	protected Circle clone() {
		Circle circle = null;
		Point point = null;
		try {
			circle = (Circle) super.clone();
			point = circle.p.clone();
			circle.p = point;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return circle;
	}
}