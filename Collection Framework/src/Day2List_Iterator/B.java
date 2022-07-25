package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {

	public static void main(String[] args) {

		List al=new ArrayList();
		
		al.add("abc");
		al.add("xyz");
		al.add("pqr");
		System.out.println(al);
		
	Iterator itr=al.iterator();
	
	while(itr.hasNext())
	{
		String s=(String)itr.next();
		System.out.println(s);
	}
		
	}

}
