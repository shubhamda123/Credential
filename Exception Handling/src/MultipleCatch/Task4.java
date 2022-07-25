package MultipleCatch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		//get the value from User using Scanner class
		try
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String s1=sc.next();
		System.out.println(s1);
		System.out.println(s1.charAt(6));
		
		System.out.println("enter the second number");
		int n=sc.nextInt();//put Zero first


		
		int x=10/n;
		System.out.println(x);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("enter String upto 7 letters");
		}
		catch(ArithmeticException e)
		{
			System.out.println("enter non zero value");
		}
		System.out.println("main end");

	}

}
