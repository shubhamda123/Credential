package NonPrimitive1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student1_Test1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Student1 s=new Student1();
		System.out.println("enter rollno");
		s.setRollno(sc.nextInt());
		
		System.out.println("enter name");
		s.setName(sc.next()+sc.nextLine());
		
		System.out.println("enter address");
		s.setAddr(sc.next()+sc.nextLine());
		
		System.out.println("--------------");
		
	    Student1 s1=new Student1();
	    System.out.println("enter rollno");
		s1.setRollno(sc.nextInt());
		
		System.out.println("enter name");
		s1.setName(sc.next()+sc.nextLine());
		
		System.out.println("enter address");
		s1.setAddr(sc.next()+sc.nextLine());
	    
	    System.out.println("-----------------");
	    Student1 s2=new Student1();
	    System.out.println("enter rollno");
		s2.setRollno(sc.nextInt());
		
		System.out.println("enter name");
		s2.setName(sc.next()+sc.nextLine());
		
		System.out.println("enter address");
		s2.setAddr(sc.next()+sc.nextLine());		
	    		
	    		
	    List al=new ArrayList();
	    al.add(s);
	    al.add(s1);
	    al.add(s2);
	    
	    Iterator itr=al.iterator();
	    while(itr.hasNext())
	    {
	      Student1 stu=(Student1)itr.next();
	      System.out.println(stu.getRollno());
	      System.out.println(stu.getName());
	      System.out.println(stu.getAddr());
	    }
	    	
	}
		
}


