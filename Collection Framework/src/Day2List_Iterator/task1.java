package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task1 {

	public static void main(String[] args) {

		List al=new ArrayList();
		al.add("xyz");
		al.add("abcd");
		al.add("pqr");
		System.out.println(al);
		
		String s=(String)al.get(0);
		System.out.println(s);
		String s1=(String)al.get(1);
		System.out.println(s1);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			//String i=(String)itr.next();
			//System.out.println(i);
			Object o=itr.next();
		//	System.out.println(o);
			if(o instanceof String)
			{
				String m=(String)o;
				System.out.println("String= "+m);
			}
		}
	}

}
