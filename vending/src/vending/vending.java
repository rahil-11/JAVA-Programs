 package vending;

import java.util.Scanner;

public class vending {



public static void main(String[] args) {

Scanner in=new Scanner(System.in);

System.out.println("Enter Product Code");

String code=in.next();

getProduct(code);

}

public static void getProduct(String productCode)

{

switch(productCode)

{

case "p01":System.out.println("COCA COLA");

break;

case "p02":System.out.println("THUMPS UP");

break;

case "p03":System.out.println("Sprite");

break;

default:System.out.println("sattu sharbat");

}

}

}