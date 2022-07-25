package NonPrimitive2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {

	public List m1()
	{
		Scanner sc=new Scanner(System.in);
		
	  Student s=new Student();
	  System.out.println("enter name");
	  s.setName(sc.next()+sc.nextLine());
	  
	  System.out.println("enter Rollno");
	  s.setRollno(sc.nextInt());
	  System.out.println("-----------------");
	  
	  Student s1=new Student();
	  System.out.println("enter name");
	  s1.setName(sc.next()+sc.nextLine());
	  
	  System.out.println("enter Rollno");
	  s1.setRollno(sc.nextInt());
	  
	  List al=new ArrayList();
	  al.add(s);
	  al.add(s1);
	  
	  return al;

	}

}
