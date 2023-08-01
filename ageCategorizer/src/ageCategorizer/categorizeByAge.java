package ageCategorizer;

import java.util.Scanner;

public class categorizeByAge {
	public static void main(String[] args) {
		
			Scanner in=new Scanner(System.in);
					int age=in.nextInt();
			categorize(age);
		}
		
		public static void categorize(int age) {
			if(age>0 && age <13) {
				System.out.println("child");
			}
			else if(age>=13 && age<20) {
				System.out.println("teen");
			}
			else if(age>20 && age<60) {
				System.out.println("adult");
		}
			else {
				System.out.println("seniour citizen");
			}
	}

}

