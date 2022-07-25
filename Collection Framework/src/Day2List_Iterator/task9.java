package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task9 {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add("mango");
		l.add("banana");
		l.add("Apple");
		l.add("Orange");
		l.add(23233.33d);
		l.add(30023.23d);
		l.add(2033.44d);
		l.add(40493.33d);
		//used iterator instanceof 
		System.out.println(l);
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			   Object o=itr.next();
			   if(o instanceof String)
			   {
				   String s=(String)o;
				   System.out.println(s);
			   }
			   else if(o instanceof Double)
			   {
				   double d=(double)o;
				   System.out.println(d);
			   }
			   
		}
	 
	}

}
