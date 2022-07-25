package Generic_Iterator_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	
	public List m1()
	{
     	Student s=new Student();
     	s.setRollno(123);
     	s.setName("shubham");
     	
     	Student s1=new Student();
     	s1.setRollno(456);
     	s1.setName("dandekar");
     	
     	
     	List<Student> al=new ArrayList<Student>();
     	al.add(s);
     	al.add(s1);
     	
     	return al;
     	
  
	}

}
