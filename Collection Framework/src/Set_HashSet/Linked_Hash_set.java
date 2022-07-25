package Set_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_set {

	public static void main(String[] args) {
		
		
	ArrayList l=new ArrayList();
	l.add(50);
	l.add(100);
	l.add(100);
	l.add("abcd");
	l.add("abcd");
	l.add(null);
	l.add(null);
//	System.out.println(l);
	
	HashSet h=new HashSet(l);//order not maintan & duplicates arenot allowed
	System.out.println("Hashset"+h);
	Iterator itr=h.iterator();
	while(itr.hasNext())
	{
	  Object o=itr.next();
	  System.out.println(o);
	}
		
	LinkedHashSet lh=new LinkedHashSet(l);// order maintain & duplicates arenot allowed
	System.out.println("LinkedHashset"+lh);
//	lh.add(10);
//	lh.add(20);
//	lh.add("Shubham");
//	lh.add("Shubham");
//	lh.add("dandekar");
//	lh.add(null);
//	lh.add(null);
//	System.out.println(lh);
	
		

	}

}
