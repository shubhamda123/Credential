package task3_12April_generic_iterator_foreachloop;

import java.util.Iterator;
import java.util.Set;

public class University {

	public static void main(String[] args) {
		
		College clg=new College();
	  Set<Student> s=clg.m1();
	  
	      Iterator<Student> itr= s.iterator();
	      while(itr.hasNext())
	      {
	    	  Student st= itr.next();
	    	  System.out.println(st.getName());
	    	  System.out.println(st.getRollno());
	      }
	      
	      System.out.println("----------------");
	      for(Student stu:s)
	      {
	    	  System.out.println(stu.getName());
	    	  System.out.println(stu.getRollno());
	      }
	      
	      
	}

}
