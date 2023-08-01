package factorsofNo;

import java.util.Scanner;

public class factorsofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("ENTER NO. TO FINT FACTOR");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				System.out.println("factor of " +n+ " is " +i);
			}
		}

	}

}
