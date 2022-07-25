package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task2_withoutGeneric {

	public static void main(String[] args) {
	
		Map m=new HashMap();
		m.put(1, "abc");
		m.put(2, "pqr");
		m.put(3, "xyz");
		
		System.out.println(m);
		
		Set<Integer> key=m.keySet();
		System.out.println(key);
		
		for(int k: key)
		{
			System.out.println(k);
			
			String values=(String) m.get(k);
			System.out.println(values);
		}
		System.out.println("----------------");
		     Iterator<Integer> itr=key.iterator();
		     while(itr.hasNext())
		     {
		    	 int keys=itr.next();
		    	 System.out.println("keys= "+keys);
		    	 
		    	 String value=(String) m.get(keys);
		    	 System.out.println(value);
		    			    	 
		     }
		
		
		
		
		
		
		

	}

}
