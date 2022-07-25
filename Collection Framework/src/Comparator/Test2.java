package Comparator;

import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
	

		Student stu1=new Student();
		stu1.setRollno(2);
		stu1.setName("aaa");
		
		Student stu2=new Student();
		stu2.setRollno(1);
		stu2.setName("ccc");
		
		Student stu3=new Student();
		stu3.setRollno(3);
		stu3.setName("bbb");
		
		Set<Student> st=new TreeSet<Student>(new RollnoSort());
		st.add(stu1);
		st.add(stu2);
		st.add(stu3);
		
		Set<Student> st1=new TreeSet<Student>(new NameSort());
		st1.add(stu1);
		st1.add(stu2);
		st1.add(stu3);
		
		
		for(Student s:st1)
		{
			System.out.println(s.getRollno());
			System.out.println(s.getName());
		}
		
		
	}

}
