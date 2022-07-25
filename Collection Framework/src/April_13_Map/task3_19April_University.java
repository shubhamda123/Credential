package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task3_19April_University {

	public static void main(String[] args) {
		
		Map<Integer, String> Bsc=new HashMap<>();
		Bsc.put(1, "BscSub1");
		Bsc.put(2, "BscSub2");
		
		Map<Integer, String> Bca=new HashMap<>();
		Bca.put(3, "BcaSub1");
		Bca.put(4, "BcaSub2");
		
		Map<Integer,Map<Integer, String>> DattaMeghe=new HashMap<>();
		DattaMeghe.put(5, Bsc);
		DattaMeghe.put(6, Bca);
		
		Map<Integer,String> Engg=new HashMap<>();
		Engg.put(7, "Mechanical Engg");
		Engg.put(8, "Civil Engg");
		
		Map<Integer,String> diploma=new HashMap<>();
		diploma.put(9,"computer diploma");
		diploma.put(10, "Electrical diploma");
		
		Map<Integer,Map<Integer,String>> BDcolleg=new HashMap<>();
		BDcolleg.put(11, Engg);
		BDcolleg.put(12, diploma);
		
		Map<Integer,Map<Integer,Map<Integer,String>>> university=new HashMap<>();
		university.put(13,DattaMeghe);
		university.put(14, BDcolleg);
		
		
	    Set<Integer> univerkey=	university.keySet();
	    Iterator<Integer> itr=univerkey.iterator();
	    while(itr.hasNext())
	    {
	    	int ukey=itr.next();
	    	Map<Integer,Map<Integer,String>>collegemap=university.get(ukey);
	    	
	    	Set<Integer> collegekey=collegemap.keySet();
	    	Iterator<Integer> itr1=collegekey.iterator();
	    	while(itr1.hasNext())
	    	{
	    		int ckey=itr1.next();
	    		Map<Integer,String> fieldmap=collegemap.get(ckey);
	    		
	    		Set<Integer> fieldkey=fieldmap.keySet();
	    	       Iterator<Integer> itr2=fieldkey.iterator();
	    		   while(itr2.hasNext())
	    		   {
	    			   int fkey=itr2.next();
	    			   String sub=fieldmap.get(fkey);
	    			   System.out.println(sub);
	    		   }
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
