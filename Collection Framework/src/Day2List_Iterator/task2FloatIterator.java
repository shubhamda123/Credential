package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task2FloatIterator {

	public static void main(String[] args) {
  //11f, 12.34f, 13.34f, 14.11f, 15.8f, 16f
		
		List al=new ArrayList();
		al.add(11f);
		al.add(12.34f);
		al.add(13.34f);
		al.add(14.11f);
		al.add(15.8f);
		al.add(16f);
		System.out.println("float"+al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			float f=(float)itr.next();		
			System.out.println(f);
			
		}

	}

}
