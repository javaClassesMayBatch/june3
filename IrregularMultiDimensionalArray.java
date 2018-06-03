package june3;

public class IrregularMultiDimensionalArray {
	public static void main(String args[]) {
		//1 d
		int[] a;
		a = new int[2];
		a[0] = 4;
		a[1] =7;
		
		//2 d
		int[][] irregularArray2d;
		irregularArray2d = new int[3][];
		
		irregularArray2d[0] = new int[4];
		irregularArray2d[1] = new int[3];
		irregularArray2d[2] = new int[1];
		
		irregularArray2d[0][0] = 1;
		irregularArray2d[0][1] = 2;
		irregularArray2d[0][2] = 3;
		irregularArray2d[0][3] = 4;
		
		irregularArray2d[1][0] = 11;
		irregularArray2d[1][1] = 12;
		irregularArray2d[1][2] = 13;
		
		irregularArray2d[2][0] = 100;
		
		
		
		
		
		/*			col0	col1
		 * row0		8		7
		 * row1		6		5
		 * row2		4		3
		 * 
		 * */		
		
		System.out.println("\tcol0\tcol1\tcol2\tcol3");
		for(int[] row : irregularArray2d) {
			System.out.print("row");
			for(int item : row) {				
				System.out.print("\t"+item);
			}
			System.out.println();
		}
		
	}
}
