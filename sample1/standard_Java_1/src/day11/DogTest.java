package day11;

public class DogTest {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.display();
		
		Dog d2 = new Dog("백구", "진돗개");
		d2.display();
		
		Dog d3 = new Dog("황구","진돗개","강아지과");
		d3.display();
		
	}
}
