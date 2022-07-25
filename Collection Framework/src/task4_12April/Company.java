package task4_12April;

import java.util.*;

public class Company {
	
	  public  List<Set<Employee>> designation(){
	      //set all employee data and add it into the generic set and then list here
		  
		Employee e=new Employee();
		e.setEid(111);
		e.setEname("abc");
		e.setEsalary(5000d);
	
		Employee e1=new Employee();
		e1.setEid(222);
		e1.setEname("xyz");
		e1.setEsalary(2000);
		
	   Set<Employee> developer=new HashSet<>();
	   developer.add(e);
	   developer.add(e1);
	
	   
		Employee e2=new Employee();
		e2.setEid(333);
		e2.setEname("pqr");
		e2.setEsalary(3000);

		Employee e3=new Employee();
		e3.setEid(444);
		e3.setEname("klm");
		e3.setEsalary(4000);
		
		 Set<Employee> tester=new HashSet<>();
		 tester.add(e2);
		 tester.add(e3);
		
		 List<Set<Employee>> team=new ArrayList<>();
		 team.add(developer);
		 team.add(tester);
		 
		 return team; 
		 
	   }
	    public static void main(String args[]){
	         //get all employee data using iterator and for each loop here  
	    	
	    	Company c=new Company();
	    	List<Set<Employee>> al= c.designation();
	    	
	           Iterator<Set<Employee>>  itr= al.iterator();
	           while(itr.hasNext())
	           {
	        	  Set<Employee> e= itr.next();
	        	                
	        	   Iterator<Employee>  itr2=e.iterator();
	        	   while(itr2.hasNext())
	        	   {
	        		   Employee e1=itr2.next();
	        		   System.out.println(e1.getEid());
	        		   System.out.println(e1.getEname());
	        		   System.out.println(e1.getEsalary());
	        	   }
	           
	           }
	           
	     	   System.out.println("----------------------------");
	 	      for(Set<Employee> field:al)
	 	      {
	 	    	  for(Employee emp:field)
	 	    	  {
	 	    		  System.out.println(emp.getEid());
	 	    		  System.out.println(emp.getEname());
	 	    		  System.out.println(emp.getEsalary());
	 	    	  }
	 	      }
	 	       	
	
	    }
}


