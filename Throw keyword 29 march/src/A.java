
public class A {
	
	public void m1(int age)
	{
		if(age<=0)
		{
			ArithmeticException e=new ArithmeticException("age must be greater than zero");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		 
		A a=new A();
		try
		{
			a.m1(-5);
			
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
