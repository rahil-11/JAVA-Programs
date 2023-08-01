package checkgrade;

import java.util.Scanner;

public class main

{

public static void checkGrade(int grade)

{
	if(grade>50)
{
	System.out.println("PASS");
}else {
	System.out.println("fail");
}

}

public static void main(String[] args)


{
Scanner in=new Scanner(System.in);
System.out.println("ENTER GRADE");
int n=in.nextInt();
checkGrade(n);

}

}
