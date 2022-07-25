package Day1_List_LIstArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		 
		List al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number 1");
		int a=sc.nextInt();
		al.add(a);
		

		System.out.println("enter number 2");
		int b=sc.nextInt();
		al.add(b);
		

		System.out.println("enter number 3");
		int c=sc.nextInt();
		al.add(c);
		

		System.out.println("enter number 4");
		int d=sc.nextInt();
		al.add(d);
		System.out.println("---------------------");
		
		int i=(int)al.get(0);
		System.out.println(i);
		
		int i1=(int)al.get(1);
		System.out.println(i1);
		
		int i2=(int)al.get(2);
		System.out.println(i2);
		
		int i3=(int)al.get(3);
		System.out.println(i3);
		

	}
}
