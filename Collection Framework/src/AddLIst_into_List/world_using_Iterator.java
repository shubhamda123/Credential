package AddLIst_into_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class world_using_Iterator {

	public static void main(String[] args) {
		
		List<String> Mh=new ArrayList<String>();
		Mh.add("Pune");
		Mh.add("Mumbai");
		
		List<String> Mp=new ArrayList<String>();
		Mp.add("Bhopal");
		Mp.add("Indore");
		
		List<String> Jstate1=new ArrayList<String>();
		Jstate1.add("Tokyo");
		Jstate1.add("Osaka");
		
		List<String> Jstate2=new ArrayList<String>();
		Jstate2.add("Hiroshima");
		Jstate2.add("Nagasaki");
		
		List<List<String>> india=new ArrayList<List<String>>();
		india.add(Mh);
		india.add(Mp);
		
		List<List<String>> japan=new ArrayList<List<String>>();
		japan.add(Jstate1);
		japan.add(Jstate2);
		
		List<List<List<String>>> world=new ArrayList<List<List<String>>>();
		world.add(india);
		world.add(japan);
		
		             Iterator<List<List<String>>> itr=world.iterator();
		             while(itr.hasNext())
		             {
		            	 List<List<String>> country =itr.next();	
		                   
		                   Iterator<List<String>> itr2  =  country.iterator();
		                   
		                   while(itr2.hasNext())
		                   {
		                	   List<String> state=itr2.next();
		                	   
		                	           Iterator<String>  itr3= state.iterator();
		                	           while(itr3.hasNext())
		                	           {
		                	        	    String city=  itr3.next();
		                	        	   System.out.println(city);
		                	           }
		                	   
		                   }
		                      
		                      
		                   
		                   
		                      }
		
		
		

	}

}
