package task3_12April_generic_iterator_foreachloop;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class College {
	
	public Set<Student> m1()
	{
	      //set all student data and add it into the set here
	     
	         Student stu=new Student();
	         stu.setName("shubham");
	         stu.setRollno(123);

	         Student stu1=new Student();
	         stu1.setName("xyz");
	         stu1.setRollno(456);
	        
	         Set<Student> fe=new LinkedHashSet<>();
	         fe.add(stu);
	         fe.add(stu1);
	         
	         return fe;
	}
}
