package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class task2 {

	public static void main(String[] args) {
		//[20.20, 34.1, 26.23, 10, 20.20, 45, 26.23, 48, 10, 45, 54, 89, 20]
		
		List al=new ArrayList();
		al.add(20.20);
		al.add(34.1);
		al.add(26.23);
		al.add(10);
		al.add(20.20);
		al.add(45);
		al.add(26.23);
		al.add(48);
		al.add(10);
		al.add(45);
		al.add(54);
		al.add(89);
		al.add(20);
		System.out.println("List"+al);
		
		HashSet hs=new HashSet(al);
		System.out.println("hashset"+hs);
		
		LinkedHashSet ld=new LinkedHashSet(al);
		System.out.println("linkedHashset"+ld);
		
		Iterator itr=ld.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}

	}

}
