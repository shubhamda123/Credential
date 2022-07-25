package Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task4 {

	public static void main(String[] args) {
		
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
		System.out.println("List"+al);
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			int x=itr.next();
			System.out.println(x);
		}

	}

}
