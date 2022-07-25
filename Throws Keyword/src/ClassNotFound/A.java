package ClassNotFound;

public class A {
	
	public void m1() throws ClassNotFoundException 
	{
		System.out.println("Start");
		Class.forName("Throwss.Student");
		System.out.println("class found");
	}

}
