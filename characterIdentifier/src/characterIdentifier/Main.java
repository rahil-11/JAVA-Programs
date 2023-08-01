package characterIdentifier;

import java.util.Scanner;

public class Main

{

public static void identifyCharacter(char ch)

{
if(Character.isUpperCase(ch)) {
	if(ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U') {
		System.out.println("Enter character "+ch+" is a capital vowal");
	}
	else {
		System.out.println("Enter character is a capital consonent");
	}
}
else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	System.out.println("enter character is a small vowel");


else {
	System.out.println("enter character is a small consonent");
}
}
public static void main(String[] args)

{
Scanner in=new Scanner(System.in);
char ch=in.next().charAt(0);


identifyCharacter(ch);
}

}
