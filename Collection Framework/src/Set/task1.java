package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class task1 {

	public static void main(String[] args) {
		
	// [Abc, ABC, Abc, ABC, ABc, Abc, ABC] 	
		
		List<String> al=new ArrayList<String>();
		
		al.add("Abc");
		al.add("ABC");
		al.add("Abc");
		al.add("ABC");
		al.add("ABc");
		al.add("Abc");
		al.add("ABC");
		System.out.println("List"+al);
		
//		Iterator<String> itr=al.iterator();
//		while(itr.hasNext())
//		{
//			String s=itr.next();
//			System.out.println(s);
//		}
		
		HashSet<String> hs=new HashSet<String>(al);// duplicates removed
		System.out.println("Hashset"+hs);
		
		LinkedHashSet< String> ld=new LinkedHashSet<String>(al);//duplicates removed &order is maintained
		System.out.println("linkedHashSet"+ld);// 
	
	}

}
