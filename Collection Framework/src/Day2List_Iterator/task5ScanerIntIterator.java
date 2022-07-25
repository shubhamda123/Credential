package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class task5ScanerIntIterator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List al=new ArrayList();
		
		System.out.println("enter the number");
		int a=sc.nextInt();
		al.add(a);
		

		System.out.println("enter the number");
		int a1=sc.nextInt();
		al.add(a1);
		

		System.out.println("enter the number");
		int a2=sc.nextInt();
		al.add(a2);
		

		System.out.println("enter the number");
		int a3=sc.nextInt();
		al.add(a3);
		
		System.out.println("int"+al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
		   int i=(int)itr.next();
		   System.out.println("int= "+i);
		}
	

	}

}
