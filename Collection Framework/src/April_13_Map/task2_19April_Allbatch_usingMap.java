package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task2_19April_Allbatch_usingMap {

	public static void main(String[] args) {

		Map<Integer, String> online100=new HashMap<>();
		online100.put(1, "Shubham");
		online100.put(2, "Akash");
		online100.put(3, "Kiran");
		
		Map<Integer, String> offline100=new HashMap<>();
		offline100.put(4, "Amol");
		offline100.put(5, "Bhushan");
		offline100.put(6, "Rahul");
		
		Map<Integer,Map<Integer, String>> b100=new HashMap<>();
		b100.put(7, online100);
		b100.put(8, offline100);
		
		Map<Integer, String> online101=new HashMap<>();
		online101.put(9, "Kunal");
		online101.put(10, "Rohit");
		online101.put(11, "Saurabh");
		
		Map<Integer, String> offline101=new HashMap<>();
		offline101.put(12, "Abhilash");
		offline101.put(13, "Tejas");
		offline101.put(14, "Aditya");
		
		Map<Integer, Map<Integer, String>> b101=new HashMap<>();
		b101.put(15, online101);
		b101.put(16, offline101);
		
		Map<Integer,Map<Integer, Map<Integer, String>>> allbatch=new HashMap<>();
		allbatch.put(17, b100);
		allbatch.put(18, b101);
		
		
	    Set<Integer> allbatchkey= allbatch.keySet();
	    System.out.println("Allbatch key="+allbatchkey);
	          
	     Iterator<Integer> itr=allbatchkey.iterator();
	     while(itr.hasNext())
	     {
	    	int allkey= itr.next();
	    	System.out.println(allkey);
	    	Map<Integer,Map<Integer, String>> batchMap=allbatch.get(allkey);
	    	
	    	   Set<Integer> batchkey=batchMap.keySet();
	    	   Iterator<Integer> itr1=batchkey.iterator();
	    	   while(itr1.hasNext())
	    	   {
	    		   int bkey=itr1.next();
	    		   Map<Integer, String> modeMap= batchMap.get(bkey);
	    		   
	    		     Set<Integer>  modekey=modeMap.keySet();
	    		     Iterator<Integer> itr2 =modekey.iterator();
	    		     while(itr2.hasNext())
	    		     {
	    		    	   int mkey= itr2.next();
	    		    	  String sname=modeMap.get(mkey);
	    		    	  System.out.println(sname);
	    		     }
	    		   
	    		   
	    		   
	    		   
	    		   
	    	   }
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	     }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
	}

}
