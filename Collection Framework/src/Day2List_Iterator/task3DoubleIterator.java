package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task3DoubleIterator {

	public static void main(String[] args) {
		
// 33.3, 22.39d, 19.03, 97.23D, 78.1, 16d
		List al=new ArrayList();
		al.add(33.3);
		al.add(22.39d);
		al.add(19.03);
		al.add(97.23d);
		al.add(78.1);
		al.add(16d);
		System.out.println("double"+al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Double d=(Double)itr.next();
			System.out.println(d);
		}
	}

}
