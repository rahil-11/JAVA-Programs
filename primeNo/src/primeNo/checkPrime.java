package primeNo;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method
				int sum=0;
				Scanner in=new Scanner(System.in);
				System.out.println("ENTER NO TO CHECK PRIME");
				int n=in.nextInt();
		      for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+1;
				
			}}
			if(sum==2) {
			System.out.println(n+ " is prime no.");
		}else {
			System.out.println("not prime");
		}
			

		


	}}


