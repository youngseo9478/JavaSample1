package day8;

public class CarTest {
	public static void main(String[] args) {
		
//		c2�� c1�� ����Ǹ� ���� ����, c3�� c1�� ���ص� ����X(���� �ٸ� �ּ��̱⶧��)
		Car c1 = new Car("white", 4, "Auto");
		Car c2 = c1;
		Car c3 = new Car(c1);
		
		
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.color.equals(c2.color));
		System.out.println(c1.color.equals(c3.color));
		c1.color = "Gray";
		System.out.println(c1.color.equals(c3.color));
	}
}

class Car {
	String color;
	int door;
	String gearType;

	Car() {
	}

	Car(String color, int door, String gearType) {
		this.color = color;
		this.door = door;
		this.gearType = gearType;
	}

	// �����ڸ� �̿��� �ν��Ͻ��� ����(Car class �������) 
	Car(Car c) {
		this(c.color,c.door,c.gearType);
		
/*		this.color = c.color;
		this.door = c.door;
		this.gearType = c.gearType;*/
	}

	public void display() {
		System.out.println("============Car Information============");
		System.out.printf("[color : %s\ndoor : %d\n gearType : %s]", color, door, gearType);
		System.out.println("=======================================");
	}
}