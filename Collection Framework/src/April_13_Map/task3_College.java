package April_13_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class task3_College {

		public Map<String, task3_Student> m1()
		{
			task3_Student s=new task3_Student();
			s.setRollno(111);
			s.setName("abc");
			
			
			
			task3_Student s1=new task3_Student();
			s1.setRollno(222);
			s1.setName("xyz");
			
			Map<String, task3_Student> map=new HashMap<String, task3_Student>();
			map.put("Student1",s );
			map.put("Student2", s1);
			
           return map;
		}
		

		public static void main(String[] args) {
			
			
			task3_College c=new task3_College();
		
			Map<String, task3_Student> m= c.m1();
			//	System.out.println(m);
		
			   Set<String> key= m.keySet();
			   System.out.println(key);
			   for(String k:key)
			   {
				   System.out.println("Key="+k);
				   
				   task3_Student stu = m.get(k);
				   System.out.println(stu.getName());
				   System.out.println(stu.getRollno());
				   
			   }
			   
			   System.out.println("--------using Iterator---------");
			   
			     Iterator<String> itr= key.iterator();
			     while(itr.hasNext())
			     {
			    	String k= itr.next();
			    	System.out.println("key="+k);
			    	
			    	 task3_Student stu1=m.get(k);
			    	 System.out.println(stu1.getRollno());
			    	 System.out.println(stu1.getName());
			    	
			  
			     }
			             
			             
			   
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	


