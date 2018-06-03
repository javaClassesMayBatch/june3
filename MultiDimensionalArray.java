package june3;

public class MultiDimensionalArray {
	public static void main(String args[]) {
		//1 d
		int[] a;
		a = new int[2];
		a[0] = 4;
		a[1] =7;
		
		//2 d
		int[][] array2d;
		array2d = new int[3][2];
		array2d[0][0] = 8;
		array2d[0][1] = 7;
		array2d[1][0] = 6;
		array2d[1][1] = 5;
		array2d[2][0] = 4;
		array2d[2][1] = 3;
		
		/*			col0	col1
		 * row0		8		7
		 * row1		6		5
		 * row2		4		3
		 * 
		 * */		
		
		System.out.println("\tcol0\tcol1");
		for(int[] row : array2d) {			
			System.out.println("row\t"+row[0]+"\t"+row[1]);
		}
		
	}
}
