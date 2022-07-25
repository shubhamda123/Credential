package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(5);
		al.add(10);
		al.add(10);
		System.out.println(al);
		
		Set<Integer> s=new TreeSet<Integer>(al);
		System.out.println(s);
		
		Collections.sort(al);
		System.out.println(al);

	}

}
