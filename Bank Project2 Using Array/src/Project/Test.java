package Project;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("******Welcome to SBI*******");
		System.out.println("----------------------------");
	       RBI r=new SBI();
         Scanner sc=new Scanner(System.in);
         
         char ch='y';
         do
         {
        	 System.out.println("press 1 for create account");
 			System.out.println("press 2 for Display all account details");
 			System.out.println("press 3 for Deposite money");
 			System.out.println("press 4 for Withdraw money");
 			System.out.println("press 5 for check balance");
 			System.out.println("--------------------------------------");
 			
 			
 			System.out.println("enter your choice");
 			
 			int a=sc.nextInt();
 			
 			switch(a)
 			{
 			case 1:
 				r.createAccount();
 				break;
 				
 			case 2:
 				r.displayAllDetails();
 				break;
 			case 3:
 				r.depositeMoney();
 				break;
 			case 4:
 				r.withdrawal();
 				break;
 			case 5:
 				r.balanceCheck();
 				break;
 				
 				default:
 					System.out.println("invalid case");
 					
           }
         
 			System.out.println("Thank you for using SBI--------");
 			System.out.println("----------------------------");
 			System.out.println("Do you want to continue yes(y)/no(n)");
 			ch=sc.next().charAt(0);
         }
 			while(ch=='y');
 			
         
         }
}




	
         
         
		
			
	




