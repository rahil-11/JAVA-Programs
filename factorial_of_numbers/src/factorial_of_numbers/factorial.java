package factorial_of_numbers;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("ENTER NO OF FACTORIAL TO PRINT");
		int n=in.nextInt();
				int fac=1
;
		for(int i=1;i<=n;i++)
		{
		 fac=i*fac;
		}
		System.out.println(fac);
	}

}
