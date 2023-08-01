package sumofDigit;
import java.util.Scanner;
public class sumOfDigit {


public static void calculateSumOfDigits(int n) {
int sum=0;
while(n!=0) {
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
}
System.out.println("sum of digit of "+n+" is "+sum );
}

public static void main(String[] args)

{
System.out.println("enter number to find sum of its digit");
Scanner scan=new Scanner(System.in);

int n=scan.nextInt();

calculateSumOfDigits(n);

}

}
