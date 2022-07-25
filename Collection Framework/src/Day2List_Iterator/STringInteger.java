package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class STringInteger {

	public static void main(String[] args) {
		
		List al=new ArrayList();
		
		al.add(5);
		al.add(10);
		al.add(10);
		al.add("abc");
		al.add("xyz");
		al.add(50);
		al.add("jfkf");
	   System.out.println(al);
	   
	   Iterator itr=al.iterator();
	   
	   while(itr.hasNext())
	   {
		  Object o= itr.next();
		 // System.out.println(o);
		  
		  if(o instanceof Integer)
		  {
			  int i=(int)o;
			  System.out.println(o);
		  }
		  else if(o instanceof String)
		  {
			  String s=(String)o;
			  System.out.println(o);
		  }
	   }
	 
	}

}
