package kodnest.pattern.assignment;
import java.util.*;
public class pattern23 {

	
			public static void printPattern(int n)
			{
				int i, j;
				for (i = 1; i <= n; i++) {

					// inner loop to print spaces.
					for (j = 1; j < i; j++) {
						System.out.print(" ");
					}

					// inner loop to print value of j.
					for (j = i; j <= n; j++) {
						System.out.print(j + " ");
					}

					// printing new line for each row
					System.out.println();
				}
			}

			public static void main(String args[])
			{
				int n = 6;
				printPattern(n);
			}
		

	}


