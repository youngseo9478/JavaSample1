package day12;

public class Test02 {

	public static void main(String[] args) {
		Animal d = new Dog();
		Animal f = new Fish();
//		new Animal(); Animal을 메모리에 올리겠습니다!->Error
//		Animal은 *타입*으로는 쓸 수 있지만 *객체*로 만들 수는 없다
//		미완성인 코드가 있기때문에 메모리에 올릴 수 없는 것!
		
		Animal[] animals = new Animal[5];
//		애니멀 타입의 객체 5개를 저장하는 배열
//		이것 역시 타입 선언이기때문에 에러안나고 가능한 것
		
		Animal[] animals2 = {d,f};
		for (int i = 0; i < animals2.length; i++) {
			animals2[i].breath();
		}
	}
}
