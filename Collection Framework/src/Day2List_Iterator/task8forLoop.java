package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task8forLoop {

	public static void main(String[] args) {

		List l=new ArrayList();
		
		for (int i = 1; i <= 50; i++) {
			
			l.add(i);
		}
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			int i=(int)itr.next();
			System.out.println(i);
		}
	     
	}

}
