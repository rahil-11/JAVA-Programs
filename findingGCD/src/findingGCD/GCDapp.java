package findingGCD;

import java.util.Scanner;

public class GCDapp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter m and n");
		int m=in.nextInt();
		int n=in.nextInt();
		//GCD g=new GCD();
		int res=GCD.findGCD(m, n);
		System.out.println("gcd of "+m+ " and "+n+ " is "+res);

	}

}
