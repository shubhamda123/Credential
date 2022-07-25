package AgeInvalid;

public class A {

	public void m1(int age)throws AgeInvalidException
	{
		if(age<=0)
		{
			AgeInvalidException e=new AgeInvalidException("age must be greater than 0");
					throw e;
		}
	}
	
	public static void main(String[] args) {
		A a=new A();
		
		try
		{
			a.m1(-5);
		}
		catch(AgeInvalidException e)
		{
			System.out.println(e.getMessage());
		}
 
		
	}

}
