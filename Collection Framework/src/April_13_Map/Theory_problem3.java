package April_13_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Theory_problem3 {

	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<String>();
		mh.add("Pune");
		mh.add("Nagpur");
		mh.add("Mumbai");
		
	   List<String> jh=new ArrayList<String>();
	   jh.add("Ranchi");
	   jh.add("Ohardaya");
	   
	   Map<String, List<String>> m=new HashMap<String, List<String>>();
	   m.put("Maharashtra", mh);
	   m.put("Jharkhand", jh);
	
	   System.out.println(m);//{Jharkhand=[Ranchi, Ohardaya], Maharashtra=[Pune, Nagpur, Mumbai]}
	   
	   Set<String> keys=m.keySet();
	   System.out.println(keys);  //[Jharkhand, Maharashtra]
	   
	   for(String key:keys)
	   {
		   System.out.println(key);
		   
		   List<String> list=m.get(key);
		   System.out.println(list);     // [Ranchi, Ohardaya] 
		                                 //[Pune, Nagpur, Mumbai]
		   for(String city:list)
		   {
			   System.out.println(city); //
			   
		   }    
	   }

	}

}
