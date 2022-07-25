package NonPrimitive3;

import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Details d=new Details();
		List l=d.setDetails();
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
		  Employee e=(Employee)itr.next();
		  System.out.println(e.getEmpid());
		  System.out.println(e.getEmpname());
		  System.out.println(e.getEmpdesig());
		  System.out.println(e.getEmpsalary());
	
		}

	}

}
