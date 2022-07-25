package April_13_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Theory_Stu_Test {

	public static void main(String[] args) {
	 
		Student_Theory s1=new Student_Theory();
		s1.setRollno(1);
		s1.setName("xyz");
		
		Student_Theory s2=new Student_Theory();
		s2.setRollno(2);
		s2.setName("abc");
		
		List<Student_Theory> mca1=new ArrayList<Student_Theory>();
		mca1.add(s1);
		mca1.add(s2);
		
		Student_Theory s3=new Student_Theory();
		s3.setRollno(3);
		s3.setName("pqr");
		
		Student_Theory s4=new Student_Theory();
		s4.setRollno(4);
		s4.setName("klm");
		
	    List<Student_Theory> mca2=new ArrayList<Student_Theory>();
	    mca2.add(s3);
	    mca2.add(s4);
	    
	    Map<String, List<Student_Theory>> m=new HashMap<String, List<Student_Theory>>();
	    m.put("MCA-I", mca1);
	    m.put("MCA-II", mca2);
	    
	   Set<String> keys=m.keySet();
	   System.out.println(keys);
	   
	   for(String key:keys)
	   {
		   System.out.println(key);
		   
		      List<Student_Theory> list = m.get(key);		
		     
		      for(Student_Theory stu:list)
		      {
		    	  System.out.println(stu.getRollno());
		    	  System.out.println(stu.getName());
		      }
	   }
		
	
	}

}
