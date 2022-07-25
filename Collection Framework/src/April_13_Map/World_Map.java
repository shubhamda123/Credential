package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class World_Map {

	public static void main(String[] args) {
		
		Map<Integer, String> mh=new HashMap<Integer, String>();
		mh.put(1, "Pune");
		mh.put(2, "Nagpur");

		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(3, "Indore");
		mp.put(4, "Bhopal");
		
		Map<Integer, Map<Integer, String>> india=new HashMap<>();
		india.put(5, mh);
		india.put(6, mp);
		
		Map<Integer, String> state1=new HashMap<>();
		state1.put(7, "Washington");
		state1.put(8, "New York");
		
		Map<Integer, String> state2=new HashMap<>();
		state2.put(9, "abc");
		state2.put(10,"xyz");
		
		Map<Integer, Map<Integer,String>> USA=new HashMap<>();
		USA.put(11, state1);
		USA.put(12, state2);
		
		
		Map<Integer, Map<Integer, Map<Integer,String>>> world=new HashMap<>();
		world.put(13, india);
		world.put(14, USA);
		
		     Set<Integer>  worldkey= world.keySet();
		     
		   Iterator<Integer> itr =  worldkey.iterator();
		   while(itr.hasNext())
		   {
			      int wkey = itr.next();
			      System.out.println(wkey);
			      
			   Map<Integer, Map<Integer, String>> country=  world.get(wkey);
			   
			  Set<Integer> countrykey=country.keySet();
			    Iterator<Integer> itr1=countrykey.iterator();
			    while(itr1.hasNext())
			    {
			          int ckey=itr1.next();
			          
			         Map<Integer,String> state=country.get(ckey);
			             Set<Integer>  statekey= state.keySet();	
			                Iterator<Integer> itr2=statekey.iterator();
			                while(itr2.hasNext())
			                {
			                     int skey=itr2.next();
			                     
			                      String city =state.get(skey);    
			                     System.out.println("city="+city);
			                }
			          
			          
			    }
			      
			      
		   }
		   
	}

}
