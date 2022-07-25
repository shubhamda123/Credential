package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task1_19April_World_usingMAp {

	public static void main(String[] args) {
	
		Map<Integer, String> mh=new HashMap<>();
		mh.put(1, "Wardha");
		mh.put(2, "Nagpur");
		
		Map<Integer,String> up=new HashMap<>();
		up.put(3, "Lucknow");
		up.put(4, "Kanpur");
		
		Map<Integer, Map<Integer,String>> india=new HashMap<>();
		india.put(5, mh);
		india.put(6, up);
		System.out.println("------------------");
		
		Map<Integer, String> london=new HashMap<>();
		london.put(7, "newham");
		london.put(8, "kingsten");
		
		Map<Integer, String> scotland=new HashMap<>();
		scotland.put(7, "edinberg");
		scotland.put(8, "Dundee");
		
		Map<Integer,Map<Integer, String>> uk=new HashMap<>();
		uk.put(9, london);
		uk.put(10, scotland);
		
		System.out.println("-------------------");
		
		Map<Integer,String> Usastate1=new HashMap<>();
		Usastate1.put(11, "usacity1");
		Usastate1.put(12, "usacity2");
		
		Map<Integer,String> Usastate2=new HashMap<>();
		Usastate2.put(11, "usacity3");
		Usastate2.put(12, "usacity4");
		
		Map<Integer,Map<Integer,String>> Usa=new HashMap<>();
		Usa.put(13, Usastate1);
		Usa.put(14, Usastate2);
		
		System.out.println("-------------------");
		
		Map<Integer,Map<Integer,Map<Integer,String>>> world=new HashMap<>();
		world.put(15, india);
		world.put(16, uk);
		world.put(17, Usa);
		
		
		Set<Integer> worldkey=world.keySet();
		System.out.println(worldkey);
		
		Iterator<Integer> itr=worldkey.iterator();
		while(itr.hasNext())
		{
			int wkey=itr.next();
			System.out.println(wkey);
			Map<Integer,Map<Integer,String>>country=world.get(wkey);
			      
			 Set<Integer> countrykey=country.keySet();
			     Iterator<Integer> itr1=countrykey.iterator();
			     while(itr1.hasNext())
			     {
			    	 int ckey=itr1.next();
			    	 Map<Integer,String> state=country.get(ckey);
			    	  
			    	 Set<Integer> statekey=state.keySet();
			    	  Iterator<Integer> itr2=statekey.iterator();
			    	  while(itr2.hasNext())
			    	  {
			    		int skey = itr2.next();
			    		    String city = state.get(skey);
			    		    System.out.println(city);
			    	  }
			    	 
			    	 
			     }
			              
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
