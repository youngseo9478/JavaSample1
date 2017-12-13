package day6;

public class ArrayEx8 {
	public static void main(String[] args) {
		int two[][] = new int[4][3];
		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++) {
				two[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++) {
				System.out.printf("%3d",two[i][j]);
			}
			System.out.println();
		}
	}
}
