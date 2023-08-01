package checkMultipleOfTen;

import java.util.Scanner;

public class Main { 
	public static void checkMultipleOfTen(int n,int m) {
		if(n%m==0) {
			System.out.println("1st no "+n+ "is multiple of "+m);
		
} 
		else {
			System.out.println("NOT multiple");
		}
	}	
	
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("enter no.s to check");
		int n=in.nextInt();
		int m=in.nextInt();
		checkMultipleOfTen(n,m);
		
		
		
	} 
	}

