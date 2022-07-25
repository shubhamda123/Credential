package task2_12April_AddList_into_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class with_generic_iterator {

	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<String>();
		mh.add("Punee");
		mh.add("Mumbai");
		
		List<String> jh=new ArrayList<String>();
		jh.add("Ranchi");
		jh.add("Lohardaya");
		
		Set<List<String>> india=new HashSet<List<String>>();
		india.add(mh);
		india.add(jh);
		
		System.out.println("india"+india);
		
		         Iterator<List<String>> itr= india.iterator();
		         while(itr.hasNext())
		         {
		        	List<String> state= itr.next();
		        	
		             Iterator<String> itr2= state.iterator();
		        	  while(itr2.hasNext())
		        	  {
		        		 String city= itr2.next();
		        		 System.out.println(city);
		        	  }
		        	
		        	
		        	
		         }
		
		
		
	}

}
