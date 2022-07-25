package Set_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsingIterator_HashSet {

	public static void main(String[] args) {

		Set h=new HashSet();
		h.add(10);
		h.add(20);
		h.add("shubham");
		h.add('K');
		System.out.println(h);

		Iterator itr=h.iterator();
		
		while(itr.hasNext())
		{
		  Object o= itr.next();
			System.out.println(o);
		}
	}

}
