package task2_12April_AddList_into_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class with_generic_foreachloop {

	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<String>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> jh=new ArrayList<String>();
		jh.add("Ranchi");
		jh.add("Lohardaya");
		
		Set<List<String>> india=new HashSet<List<String>>();
		india.add(mh);
		india.add(jh);
		
		System.out.println("india"+india);
		
		for(List<String> state:india)
		{
			for(String city:state)
			{
				System.out.println("indian city-"+city);
			}
		}
		
	
	}

}
