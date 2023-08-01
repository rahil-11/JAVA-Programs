package reverseNmber;

import java.util.Scanner;

public class revNoApp {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter a number to find its reverse");
int n=in.nextInt();
revNO rn=new revNO();
int result=rn.reverse(n);
System.out.println("REVERSE OF NUMBER "+n+ " IS "+result);
	}

}
