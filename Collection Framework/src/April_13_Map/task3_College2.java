package April_13_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class task3_College2 {
		
		public Map<String, List<task3_Student>> m1()
		{
			task3_Student s=new task3_Student();
			s.setRollno(111);
			s.setName("abc");
			
			List<task3_Student> l1=new ArrayList<task3_Student>();
			l1.add(s);
			
			task3_Student s1=new task3_Student();
			s1.setRollno(222);
			s1.setName("xyz");
			
			List<task3_Student> l2=new ArrayList<task3_Student>();
			l2.add(s1);
			
			
			Map<String, List<task3_Student>> map=new HashMap<String, List<task3_Student>>();
			map.put("Student1", l1);
			map.put("Student2", l2);
			
	         return map;		
	 
		}
		 public static void main(String[] args) {	
			 
			 task3_College2 c=new task3_College2();
			 Map<String, List<task3_Student>> map= c.m1();

			Set<String> key= map.keySet();
			System.out.println("key="+key);
			
			for(String k:key)
			{
				System.out.println(k);
				
				List<task3_Student> list=map.get(k);
				//System.out.println(list);
				
				for(task3_Student value:list)
				{
					System.out.println(value.getRollno());
					System.out.println(value.getName());
				}
			}
			
			System.out.println("-----iterator--------");
			  Iterator<String> itr = key.iterator();
			  while(itr.hasNext())
			  {
				  String k= itr.next();
				  System.out.println(k);
				  
				  List<task3_Student> list=map.get(k);
				  
				    Iterator<task3_Student>   itr2= list.iterator();
				    while(itr2.hasNext())
				    {
				    	task3_Student stu=itr2.next();
				    	System.out.println(stu.getRollno());
				    	System.out.println(stu.getName());
				    }
				    
				  
				  
				  
				  
				  
			  }
			
			
			
			
			
			
			
			
			
			
			
			
			
			 
			 
			 
			 
			 
			 
			 
			 

	}

}
