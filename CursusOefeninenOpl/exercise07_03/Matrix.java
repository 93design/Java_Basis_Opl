package be.intecbrussel.basis.exercise07_03;

public class Matrix {
	public static void main(String[] args) {
		int[][] matrix = new int[4][6];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int[] row: matrix) {
		   for(int el: row) {
		      System.out.printf("%5d",el);
		   }
         System.out.printf("%n");		
		}
	}
}
