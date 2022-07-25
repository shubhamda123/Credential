package Day2List_Iterator;

import java.util.*;

public class task7 {

	public static void main(String[] args) {

		List l=new ArrayList();
		l.add('A');
		l.add('B');
		l.add('C');
		l.add('D');
		l.add(10.3f);
		l.add(34.22f);
		l.add(22.44f);
		l.add(29.33f);
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof Character)
			{
				char ch=(char)o;
				System.out.println(ch);
			}
			else if(o instanceof Float)
			{
				float f=(float)o;
				System.out.println(f);
			}
			
		}
		
		
		
		
		
		
		
		
		}
		

	}

