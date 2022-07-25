package ClassNotFound;

import Throwss.Student;

public class Test extends A {
	
	public void m2() throws ClassNotFoundException
	{
		m1();
	}

	public static void main(String[] args)  {
		
		Test t=new Test();
		try {
			t.m2();
		}
		catch (ClassNotFoundException e) {
			
		//	e.printStackTrace();
			System.out.println("class not found");
		}
		

		
	}

}
