package NonPrimitive1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BBB {

	public static void main(String[] args) {
	//73.30f, 256.39d, 11, 77L, 79.10, 87D, 58l 
		
		List al=new ArrayList();
		al.add(73.30f);
		al.add(256.39d);
		al.add(11);
		al.add(77l);
		al.add(79.10);
		al.add(87d);
		al.add(58l);
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
			if(o instanceof Integer)
			{
				int x=(int)o;
				System.out.println(x);
			}
			else if(o instanceof Float)
			{
				float f=(float)o;
				System.out.println(f);
			}
			else if(o instanceof Double)
			{
				double d=(double)o;
				System.out.println(d);
			}
			else if(o instanceof Long)
			{
				long l=(long)o;
				System.out.println(l);
			}
		}

	}

}
