package kodnest.pattern.assignment;

public class pattern12 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print(ch);
		}ch++;
			System.out.println();
			}
		
	
		for(int i=1;i<=5;i++) {
	
	
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}for(int j=4;j>=i;j--) {
				System.out.print(ch);
		}ch++;
			System.out.println();
			}

	}

}
