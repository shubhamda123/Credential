package NonPrimitive1_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student_Test {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setId(123);
		s.setName("Shubham dandekar");
		s.setMbno(6564363162l);
		s.setGrade('A');
		
		Student s1=new Student();
		s1.setId(456);
		s1.setName("ABCD");
		s1.setMbno(5635635l);
		s1.setGrade('B');
		
		List l=new LinkedList();
		l.add(s);
		l.add(s1);
		
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student stu =(Student)itr.next();
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getMbno());
			System.out.println(stu.getGrade());
		}
		
		
		
	}

}
