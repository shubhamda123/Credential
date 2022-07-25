package task3;

import java.util.Scanner;

public class ScannerA {

	public void div(int a, int b) throws ZeroInputValueException
	{ 
		if(b==0) {	
			
		throw new ZeroInputValueException("Not use Input value of B is Zero");
		 }
		
		else
		{
			int c=a/b;
			System.out.println("division = "+c);
		}
	}
	public static void main(String[] args) {
		//Use keyword input here
		Scanner sc=new Scanner(System.in);
		ScannerA s=new ScannerA();
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		//Handle exception and print exception msg here
			
		try{
			s.div(a, b);
		}
		catch (ZeroInputValueException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	}


