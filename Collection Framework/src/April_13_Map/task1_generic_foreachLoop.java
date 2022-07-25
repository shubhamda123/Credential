package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task1_generic_foreachLoop {

	public static void main(String[] args) {
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
	  	
		System.out.println(m);
		
		 String s=m.get("cc");
		 System.out.println(s);
		 
		 Set<String> key=m.keySet();
		 System.out.println("key="+key);
		 
		 for(String k:key)
		 {
			 System.out.println("Key="+k);
			 
			 String value=m.get(k);
			 System.out.println("value=    "+value);	  
		 }
		 
		 System.out.println("-----------------");
		    Iterator<String>  itr=  key.iterator();
		    while(itr.hasNext())
		    {
		    	 String s1=itr.next();
		    	 System.out.println("key="+s1);
		    	 
		    	 String values=m.get(s1);
		    	 System.out.println("values=  "+values);
		    	 
		    }
		 
		 
		 
		 
		 
		 
}
}
