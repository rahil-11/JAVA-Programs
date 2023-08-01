package sumofnaturalnumbers;

import java.util.Scanner;

public class sumofnaturalNO {

	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	int sum=0;
	System.out.println("enter quantity of 1st natural no. to print");
	int N=in.nextInt();
	for(int i=1;i<=N;i++)
	{
	sum=sum+i;
	}
	System.out.println(sum);
	

	}

}
