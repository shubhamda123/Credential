package task1_12April_AddList_into_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Without_Generic {

	public static void main(String[] args) {
		
		Set mh=new HashSet();
		mh.add("Pune");
		mh.add("Mumbai");
		
		Set jh=new HashSet();
		jh.add("Ranchi");
		jh.add("Lohardaya");

		Set india=new HashSet();
		india.add(mh);
		india.add(jh);
		
		System.out.println("India"+india);

		        Iterator itr= india.iterator();
		        while(itr.hasNext())
		        {
		          Set state =(Set)itr.next();
		          Iterator it=state.iterator();
		          while(it.hasNext())
		          {
		        	 String city=(String)it.next();
		        	 System.out.println("city="+city);
		          }
		          
		        }
	
		
	}
}
