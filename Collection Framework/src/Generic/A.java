package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {

     //using iterator and foreach loop
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(5);
		al.add(10);
		al.add(20);
	//	al.add("xyz");  cannot pass String value
		
		System.out.println(al);
		
		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext())
		{
			int x=itr.next();
			System.out.println(x);
		}
		System.out.println("------------");
		
		for(int x:al)
		{
			System.out.println(x);
		}
		

	}

}
