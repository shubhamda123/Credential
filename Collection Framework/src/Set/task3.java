package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class task3 {

	public static void main(String[] args) {
	//[20, 34, 26, 10, 20, 45, 26, 48, 10, 45, 54, 89, 20]
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(34);
		al.add(26);
		al.add(10);
		al.add(20);
		al.add(45);
		al.add(26);
		al.add(48);
		al.add(10);
		al.add(45);
		al.add(54);
		al.add(89);
		al.add(20);
		System.out.println("list"+al);
		
		HashSet<Integer> hs=new HashSet<Integer>(al);
		System.out.println("hashSet"+hs);
		
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
		{
			int x=itr.next();
			System.out.println(x);
		}
		

	}

}
