package checkPrime;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner in=new scanner (System.in);
		int n=in.nextInt();
for(int i=1;i<=n;i++) {
	if(n%i==0) {
		sum=sum+1;
		
	}
	if(sum==2)
	System.out.println(n+ "is prime no.");
}
	}

}
