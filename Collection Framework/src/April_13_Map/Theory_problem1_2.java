package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Theory_problem1_2 {

	public static void main(String[] args) {
		
	    Map<Integer,String> m=new HashMap<>();
	    m.put(5,"Java");
	    m.put(10, "Python");
	    m.put(15, "spring");
	    m.put(20,"C++");
	    
	    System.out.println(m);// insertion order isnot maintained
	    
//1.	  String s=m.get(10);
//	  System.out.println(s);
//	  
//	  String s1=m.get(20);
//	  System.out.println(s1);

//2.	   System.out.println("------------------");
	  Set<Integer> keys=m.keySet();
	  System.out.println(keys);   //[20, 5, 10, 15]
	  
	  for(int key:keys)
	  {
	     System.out.println(key);
		 
		  String val=m.get(key);
		  System.out.println(val);
		  
		  
		  
	  }
	  
	     
	    
	}

}
