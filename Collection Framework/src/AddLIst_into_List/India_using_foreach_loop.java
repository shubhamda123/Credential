package AddLIst_into_List;

import java.util.ArrayList;
import java.util.List;

public class India_using_foreach_loop {
	
	public static void main(String[] args) {
		
		List<String> MH=new ArrayList<String>();
		MH.add("Pune");
		MH.add("Mumbai");
		MH.add("Nagpur");
		
		List<String> GJ=new ArrayList<String>();
		GJ.add("Surat");
		GJ.add("Vadodara");
		GJ.add("Ahmedabad");
		
		List<List> india=new ArrayList<List>();
		india.add(MH);
		india.add(GJ);
		
		System.out.println("List"+india);
		
		for(List<String> states:india)
		{
			for(String city:states)
			{
				System.out.println("city="+city);
			}
		}
		
	}

}
