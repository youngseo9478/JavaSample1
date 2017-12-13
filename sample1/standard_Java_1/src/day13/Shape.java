package day13;

public class Shape {
	
	private String color;
	
	public Shape() {
		super();
	}

	public Shape(String color) {
		setColor(color);
	}

	public void draw(){
		System.out.println(color+"»öÄ¥ÇÏ±â");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
}
