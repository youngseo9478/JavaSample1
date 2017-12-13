package day8;

public class CalcTest {
	public static void main(String[] args) {
		
		int sum = Calc.add(10, 98);
		System.out.println(sum);
		System.out.println(Calc.add(10, 98)==108);
		System.out.println(Calc.add(10,20,30,40,50));
	}
}
