package kodnest.arrays.level1;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
Scanner in=new Scanner (System.in);
System.out.println("enter lenght of an array");
int n=in.nextInt();
int arr[]=new int[n];
System.out.println("enter aaray elements");{
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=in.nextInt();
	}
	System.out.println("array contents are...");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
}
	}

}
