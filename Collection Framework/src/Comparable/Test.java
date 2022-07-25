package Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.setRollno(2);
		stu.setName("ccc");
		
		Student stu1=new Student();
		stu1.setRollno(1);
		stu1.setName("bbb");
		
		Student stu2=new Student();
		stu2.setRollno(3);
		stu2.setName("aaa");
		
		Set<Student> s=new TreeSet<>();
		s.add(stu);
		s.add(stu1);
		s.add(stu2);
		
		for(Student st:s )
		{
			System.out.println(st.getRollno());
			System.out.println(st.getName());
		}
		
		

	}

}
