package kodnest.pattern.assignment;

public class pattern15 {
//working not complete
	public static void main(String[] args) {
int n=6;
print(n);
	}
	
	
	public static void print(int n)
	{
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("");
			}
			int space=2*(n-i);
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		}System.out.println();
		
	}
}
