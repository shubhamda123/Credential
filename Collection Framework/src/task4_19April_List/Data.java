package task4_19April_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data {

	Company c=new Company();
	Manager m=new Manager();
	Employee e=new Employee();
	
	List<Company> al=new ArrayList<>();
	List<Manager> al1=new ArrayList<>();
	List<Employee> al2=new ArrayList<>();
	
	public List m1()
	{
		c.setCid(111);
		c.setCname("Wipro");
		c.setCaddress("Hinjewadi Pune");
	
		m.setMid(222);
		m.setMname("Kunal");
		m.setCompany(c);
		
		e.setEid(333);
		e.setEname("Shubham dandekar");
		e.setEaddress("Wardha");
		e.setEmbno(9637191923l);
		e.setManager(m);
		
	
		al.add(c);
		al1.add(m);
	    al2.add(e);
		return al;
	}
	
	public void m2(List l)
	{
		Iterator<Company> itr=l.iterator();
		while(itr.hasNext())
		{		
			System.out.println("-------Company-------");
			Company co=(Company)itr.next();
			System.out.println(co.getCid());
			System.out.println(co.getCname());
			System.out.println("----Manager----");
	   		    
		Iterator<Manager>itr2=al1.iterator();
		while(itr2.hasNext())
		{
			Manager ma=itr2.next();
			System.out.println(ma.getMid());
			System.out.println(ma.getMname());
			System.out.println(ma.getCompany().getCid());
			System.out.println(ma.getCompany().getCname());
		}
		    
		    System.out.println("-------Employee-------");
		    
		    
		   Iterator<Employee>itr3=al2.iterator(); 
		   while(itr3.hasNext())
		   {
			   
		    Employee emp=itr3.next();
			
		  System.out.println(emp.getEid());
		  System.out.println(emp.getEname());
		  System.out.println(emp.getEaddress());
		  System.out.println(emp.getEmbno());
		  System.out.println(emp.getManager().getMid());
		  System.out.println(emp.getManager().getMname());
		  System.out.println(emp.getManager().getCompany().getCid());
		  System.out.println(emp.getManager().getCompany().getCname());
		  System.out.println(emp.getManager().getCompany().getCaddress());
			} 
		}
	    }
	}
	

