package task1_12April_AddList_into_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class with_generic_Iterator {

	public static void main(String[] args) {
		

		Set<String> mh=new HashSet<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		Set<String> jh=new HashSet<>();
		jh.add("Ranchi");
		jh.add("Lohardaya");

		Set<Set<String>> india=new HashSet<>();
		india.add(mh);
		india.add(jh);
		
		System.out.println("india"+india);
		
	            Iterator<Set<String>> itr=india.iterator();
	            while(itr.hasNext())
	            {
	                Set state=itr.next();
	                
	                    Iterator<String> it=state.iterator();
	                    while(it.hasNext())
	                    {
	                    	String city=it.next();
	                    	System.out.println(city);
	                    }
	                
	            }

	    }

	
	}

