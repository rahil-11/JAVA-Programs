package characterIdentifier;

import java.util.Scanner;

public class charChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter character to identify");
		char ch=in.next().charAt(0);
		characterIdentifier(ch);

	}
public static void characterIdentifier(char ch)
{
	if(Character.isDigit(ch))
	{
		System.out.println("entered character "+ch+ " is digit");
	}
	else if(!Character.isLetter(ch))
	{
		System.out.println("entered character "+ch+ " is special caracter");
	}
	else {
		switch(Character.toLowerCase(ch))
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch)) {
				System.out.println("entered character "+ch+ " is lowercase vowel");
			}
			else {
				System.out.println("entered character " +ch+ "is uppercase vowel");
			}
			break;
			
			default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("entered character" +ch+ " is lower case consonant");
				}
				else {
				System.out.println("entered character "+ch+ "is upper case consonant");
						
					}
				}
		}
	}

}
