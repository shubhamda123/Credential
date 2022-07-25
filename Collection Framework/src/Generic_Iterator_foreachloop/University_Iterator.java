package Generic_Iterator_foreachloop;

import java.util.Iterator;
import java.util.List;

public class University_Iterator {

	public static void main(String[] args) {
	
   College c=new College();
     List<Student> l=c.m1();
     
             Iterator<Student> itr= l.iterator();
             while(itr.hasNext())
             {
            	    Student stu= itr.next();
            	    System.out.println(stu.getRollno());
            	    System.out.println(stu.getName());
             }

	}

}
