public class Pattern {

	public static void main(String[] args) {
		int r=5;
		for (int i = r; i>=1; i--) {
			for (int j = i; j <r; j++) {
				System.out.print(" ");
				}
			for (int k = 1; k <=2*i-1; k++) {
			System.out.print("*");
				
			}
		   System.out.println("");
			
		}
	}

}