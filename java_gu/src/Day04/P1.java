package Day04;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 			* i=1	' '=4	*=1
		 * 		   ** i=2	' '=3	*=2
		 * 		  *** i=3	' '=2	*=3
		 * 		 **** i=4	' '=1	*=4
		 * 		***** i=5	' '=0	*=5
		 * 					' '=5-i	*=1개
		 */
		int rows = 5;
		for(int i=1; i<=rows; ++i) {
			
			for(int j=1; j<=rows - i ; ++j) {
				
				System.out.print(' ');
			}
				
			for(int j=1; j<=1; ++j) {
				
				System.out.print("*");
			}
				
			
			System.out.println();
		}
	

	}

}

