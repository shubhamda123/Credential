package NonPrimitive2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {

	public static void main(String[] args) {
		
		College c=new College();
	     List l=c.m1();
		
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student s=(Student)itr.next();
			System.out.println(s.getName());
			System.out.println(s.getRollno());
		}
		
 
	}

}
