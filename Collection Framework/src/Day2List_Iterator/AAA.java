package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AAA {

	public static void main(String[] args) {
//34, "abc", 'm', "xyx",45, 'A' 
		
		List al=new ArrayList();
		
		al.add(34);
		al.add("abc");
		al.add('m');
		al.add("xyz");
		al.add(45);
		al.add('A');
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof Integer)
				{
					int x=(int)o;
					System.out.println(x);
				}
			else if(o instanceof String)
			{
				String s=(String)o;
				System.out.println(s);
			}
			else if(o instanceof Character)
			{
				char ch=(char)o;
				System.out.println(ch);
			}
		}
	}

}
