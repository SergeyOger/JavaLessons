package com.caseih;

public class Test {

	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		System.out.println(numbers[1]);
		
		int[][] matrice = {{1,2,3,8,9,4,2,6,4},{4,5,6},{7,8,9}};
		/*System.out.println(matrice[2][2]); // 1 [] string 2 [] columns
		System.out.println(matrice[1][0]);
		System.out.println(matrice[3][5]);
		
		String[][] string = new String[2][3];
		System.out.println(string[0][]);
		*/
		for(int i = 0; i<matrice.length; i++ ) {
			for(int j = 0;j< matrice[i].length;j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

}
