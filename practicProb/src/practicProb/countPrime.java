package practicProb;

import java.util.Scanner;

public class countPrime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter range");
		int count=0;
		int n=in.nextInt();
		for(int i=3;i<=n;i++) {
			int res=checkPrime(i);
			if (res!=0) {
			
				System.out.println(res);
				count++;
				System.out.println(count);
			}
			
		}

	}
	
	public static int checkPrime(int n)
	{
		for(int i=2;i<n;i++) {
			if(n%i==0)
			{
				return 0;
				
			}
		}return n;
	}

}
