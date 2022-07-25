package April_13_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class task4_Company {

	public Map<String, List<task4_Employee>> m1()
	{
		task4_Employee e1=new task4_Employee();
		e1.setEid(111);
		e1.setEname("xyz");
		e1.setEsalary(4500);
		
		task4_Employee e2=new task4_Employee();
		e2.setEid(222);
		e2.setEname("pqr");
		e2.setEsalary(5000);
		
		List<task4_Employee> l=new ArrayList<task4_Employee>();
		l.add(e1);
		
		List<task4_Employee> l1=new ArrayList<task4_Employee>();
		l1.add(e2);
		
		Map<String,List<task4_Employee>> map=new HashMap<String, List<task4_Employee>>();
		map.put("Employee1", l);
		map.put("Employee2", l1);
		
		return map;
			
	}
		public static void main(String[] args) {
			
			task4_Company t=new task4_Company();
			Map<String, List<task4_Employee>> map=t.m1();
			
			Set<String> key=map.keySet();
			System.out.println("key="+key);
			
			for(String k:key)
			{
				System.out.println(k);
				
				List<task4_Employee> list =map.get(k);
				
				     Iterator<task4_Employee> itr2= list.iterator();
				     while(itr2.hasNext())
				     {
				    	 task4_Employee stu= itr2.next();
				    	 System.out.println(stu.getEid());
				    	 System.out.println(stu.getEname());
				    	 System.out.println(stu.getEsalary());
				     }
				     
			}
		
	
		
	}

}
