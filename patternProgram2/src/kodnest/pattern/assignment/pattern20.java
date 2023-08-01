package kodnest.pattern.assignment;

public class pattern20 {

	public static void main(String[] args) {
 for(int i=1;i<=5;i++) {
	 for(int j=1;j<=5-i;j++) {
		 System.out.print(" ");
		 
	 }
	 int a=0;
	 for(int k=1;k<=i+a;k++) {
		 if(i==5||k==1||k==i) {
			 System.out.print("*");
		 }
		 if(k<i) {
			 System.out.print(" ");
		 }
			 
				
	 }System.out.println();
	 a++;
 }
	}

}