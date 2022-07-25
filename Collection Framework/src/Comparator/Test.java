package Comparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	
		Student stu1=new Student();
		stu1.setRollno(2);
		stu1.setName("ccc");
		
		Student stu2=new Student();
		stu2.setRollno(1);
		stu2.setName("bbb");
		
		Student stu3=new Student();
		stu3.setRollno(3);
		stu3.setName("aaa");
		
		Set<Student> setstu=null;
		
		System.out.println("---select----\n"
				           +"1.Rollno sort \n"
				           +"2.Name sort\n");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1)
		{
			setstu=new TreeSet<Student>(new RollnoSort());
			
		}
		else if(ch==2)
		{
			setstu=new TreeSet<Student>(new NameSort());
		
		}
		setstu.add(stu1);
		setstu.add(stu2);
		setstu.add(stu3);
		
		
		for(Student s:setstu)
		{
			System.out.println(s.getRollno());
			System.out.println(s.getName());
		}
		

	}

}
