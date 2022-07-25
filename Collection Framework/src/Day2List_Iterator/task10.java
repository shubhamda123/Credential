package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task10 {

	public static void main(String[] args) {

		List l=new ArrayList();
		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		l.add('e');
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		l.add("AAA");
		l.add("BBB");
		l.add("CCC");
		l.add("DDD");
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof Character)
			{
				char ch=(char)o;
				System.out.println("char= "+ch);
			}
			else if(o instanceof Integer)
			{
				int i=(int)o;
				System.out.println("int= "+i);
			}
			else if(o instanceof String)
			{
				String s=(String)o;
				System.out.println("string= "+s);
			}
			
		}

	 }

	}


