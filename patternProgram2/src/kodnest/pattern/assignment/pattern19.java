package kodnest.pattern.assignment;

public class pattern19 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=6-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		
		}
		
		
		
		for(int i=4;i>=1;i--) {
			for(int j=6-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		
		}
	}

}
