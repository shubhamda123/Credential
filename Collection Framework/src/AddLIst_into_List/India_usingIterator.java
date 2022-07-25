package AddLIst_into_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class India_usingIterator {

	public static void main(String[] args) {
		
		List<String> MH=new ArrayList<String>();
		MH.add("Pune");
		MH.add("Mumbai");
		MH.add("Nagpur");
		
		List<String> GJ=new ArrayList<String>();
		GJ.add("Surat");
		GJ.add("Vadodara");
		GJ.add("Ahmedabad");
		
		List<List<String>> india=new ArrayList<List<String>>();
		india.add(MH);
		india.add(GJ);
		
		System.out.println("List"+india);
		
	         Iterator<List<String>> itr= india.iterator();
	         while(itr.hasNext())
	         {
	        	List<String> state= itr.next();
	        	
	        	    Iterator<String> itr2= state.iterator();
	        	    while(itr2.hasNext())
	        	    {
	        	      String s=itr2.next();
	        	      System.out.println("cities="+s);
	        	    }
	         }
	         						

	}

}
