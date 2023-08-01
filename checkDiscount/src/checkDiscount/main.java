package checkDiscount;

import java.util.Scanner;

public class main {



public static void checkDiscount(double purchaseAmount)

{ if(purchaseAmount>100) {
	System.out.println("discount aplicable");
}
else {
	System.out.println("discount not available");
}

}

public static void main(String[] args)

{
Scanner in=new Scanner(System.in);
System.out.println("ENTER PURCHASE AMOUNT");
double d=in.nextDouble();

checkDiscount(d);
}

}
