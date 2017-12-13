package day10;

public class Fish extends Animal{
	
	String name;
	String kind="물고기의 종류";
	
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기");
//		super.breath();
	}
}
