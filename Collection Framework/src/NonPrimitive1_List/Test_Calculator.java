package NonPrimitive1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_Calculator {

	public static void main(String[] args) {

		Calculator cal=new Calculator();
	
		List al=new ArrayList();
	
		al.add(cal);
		
		
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Calculator c=(Calculator)itr.next();
			c.add();
			c.sub();
			c.mul();
			c.div();
		}

	}

}
