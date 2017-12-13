package day12;


public class Test01 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
		
		Animal[] a = { d, new Fish(), new Dog() };
		for (int i = 0; i < a.length; i++) {
//			a[i].breath();
		}
	}
}
