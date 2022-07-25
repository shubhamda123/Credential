package NonPrimitive3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Details {
	
	public List setDetails()
	{
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("enter Id");
		e.setEmpid(sc.nextInt());
		
		System.out.println("enter name");
		e.setEmpname(sc.next()+sc.nextLine());
		
		System.out.println("designation");
		e.setEmpdesig(sc.next()+sc.nextLine());
		
		System.out.println("enter Salary");
		e.setEmpsalary(sc.nextDouble());
		
		List al=new ArrayList();
		al.add(e);
		
		return al;
	}

}
