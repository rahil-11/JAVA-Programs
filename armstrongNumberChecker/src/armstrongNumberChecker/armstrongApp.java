package armstrongNumberChecker;

import java.util.Scanner;

public class armstrongApp {

	public static void main(String[] args) {
Scanner in=new Scanner (System.in);
System.out.println("enter no");
int n=in.nextInt();
int og=n;
int count=0;
while(n!=0) {
	n=n/10;
	count++;
}
armstrong ar=new armstrong();
int res=ar.checkArmstrong(og,count);
if(res==og) {
	System.out.println("its a armsstrong no.");
	
}
else {
	System.out.println("it is not armstrong no.");
}
}

}
