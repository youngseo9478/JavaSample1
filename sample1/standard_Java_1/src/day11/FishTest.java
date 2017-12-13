package day11;

public class FishTest {
	public static void main(String[] args) {
		
		Fish f = new Fish();
		f.display();
		
		f = new Fish("구피");
		f.breath();
		f.display();
		
		f = new Fish("물고기과","구피");
		f.display();
		
	}
}
