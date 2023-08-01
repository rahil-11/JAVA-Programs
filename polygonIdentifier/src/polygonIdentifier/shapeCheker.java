package polygonIdentifier;

import java.util.Scanner;

public class shapeCheker {

	
	public static void identifyPolygon(int sides) {
		switch(sides) { 
		case 3:
	
			
			System.out.println("Triangle");
			
			break;
		case 4: 
	
			
			System.out.println("Quadrilateral");
		break;
		case 5:
	
			System.out.println("Pentagon"); 
			break;
		case 6:
		
			System.out.println("Hexagon");
			break; 
	}
	}
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("enter sides");
	
		int sides=in.nextInt();
				identifyPolygon(sides); 

	}
	
		}
	
