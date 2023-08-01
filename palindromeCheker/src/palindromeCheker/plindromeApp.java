package palindromeCheker;
import java.util.Scanner;
public class plindromeApp {


	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter a number to check palindrome");
int n=in.nextInt();
palindrome rn=new palindrome();
int result=rn.reverse(n);
System.out.println("REVERSE OF NUMBER "+n+ " IS "+result);

if(result==n) {
	System.out.println("its a palindrome number");
}
else {
	System.out.println("it is not a palindrome no");
}
	}

}

