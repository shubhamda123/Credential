package Day1_List_LIstArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		
		List al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name"); 
		String s=sc.next()+sc.nextLine();
		al.add(s);
		
		System.out.println("enter name 2"); 
		String s1=sc.next()+sc.nextLine();
		al.add(s1);
		
		System.out.println("enter name 3"); 
		String s2=sc.next()+sc.nextLine();
		al.add(s2);
		System.out.println("---------------------");
		
		String a=(String)al.get(0);
		System.out.println(a);
		
		String a1=(String)al.get(1);
		System.out.println(a1);
		
		String a2=(String)al.get(2);
		System.out.println(a2);
		
	}
}
