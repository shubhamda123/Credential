package AddLIst_into_List;

import java.util.ArrayList;
import java.util.List;

public class World_forEachLoop {

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
		
		System.out.println(world);
		
		for (List<List<String>> country:world)
		{
			for(List<String> state:country)
			{
				for(String city:state)
				{
					System.out.println(city);
				}
			}
		}
		
	}

}
