package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task6InstanceOf {

	public static void main(String[] args) {
		 
		List l=new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add("ABC");
		l.add("pqr");
		l.add("mno");
		l.add("kk");
		System.out.println(l);
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
		  Object o=itr.next();
		  //System.out.println(o);
		  
		  if(o instanceof Integer)
		  {
			  int i=(int)o;
			  System.out.println("int="+i);
		  }
		  else if(o instanceof String)
		  {
			  String s=(String)o;
			  System.out.println("String="+s);
		  }
		}
	}

}
