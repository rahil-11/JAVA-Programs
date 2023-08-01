package kodnest.pattern.assignment;

import java.util.Scanner;
import java.util.Scanner;
public class pattern13 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter size of side of square: ");
		    int side = sc.nextInt();

		    for (int i = 0; i < side; i++ )
		    {
		      for (int j = 0 ; j < side; j++ )
		      {
		        if (i == 0 || i == side - 1 || j == 0 || j == side - 1 ||i==j)
		        {
		          System.out.print("@"+" ");
		        }
		        else {
		          System.out.print(" "+ " ");
		        }
		      }
		      System.out.println();
		    }

	}

}
