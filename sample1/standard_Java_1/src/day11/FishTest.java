package day11;

public class FishTest {
	public static void main(String[] args) {
		
		Fish f = new Fish();
		f.display();
		
		f = new Fish("����");
		f.breath();
		f.display();
		
		f = new Fish("������","����");
		f.display();
		
	}
}
