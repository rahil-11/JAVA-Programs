package sumOfSeries;

import java.util.Scanner;

public class seriesSUM {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER LIMIT");
		int n=in.nextInt();
		
		calculateSumOfSeries(n);

	}





public static void calculateSumOfSeries(int n)

{
	double sum=0;
for(int i=1;i<=n;i++) {
	sum=sum+1.0/i;
}
System.out.println(sum);
}


}

