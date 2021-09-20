package Algorithms;

import java.util.Scanner;

public class main {

public static void  main(String[] args) {
		
 Scanner sc= new Scanner(System.in);
 PayMoney paymoney = new PayMoney();
 System.out.println("Enter the size of array");
 int size = sc.nextInt();
 int[] transctions = new int[size];
 for(int i=0; i<size; i++) {
	 System.out.println("Enter "+i+1+"element");
	 transctions[i] = sc.nextInt();
 }
 System.out.println("Enter the target to achive ");
 int target = sc.nextInt();
 int no_of_days = paymoney.no_of_days(transctions, target);
 if(no_of_days == -1)
	 System.out.println("Target is not acheived");
   else 
	 System.out.println("Target is acheivable after"+no_of_days+"transctions");
 sc.close();
 
 
	
	}
}
