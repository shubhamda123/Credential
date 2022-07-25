package task1_12April_AddList_into_list;

import java.util.HashSet;
import java.util.Set;

public class With_generic_foreachloop {

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
		
		for(Set<String> state:india)
		{
			for(String city:state)
			{
				System.out.println("city="+city);
			}
		}
	
	}

}
