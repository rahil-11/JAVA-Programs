package fibonacci;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int fib1=0;
int fib2=1;
System.out.println("enter limit");
int n=in.nextInt();
if(n==1) {
	System.out.println(fib1);
}
if(n==2) {
	System.out.println(fib1+" "+fib2);
}
else {
	System.out.print(fib1+" "+fib2+" ");
	for(int i=3;i<=n;i++) {
int	nextno=fib1+fib2;
		System.out.print(nextno+" ");
		fib1=fib2;
		fib2=nextno;
		
	}
}
	}

}
