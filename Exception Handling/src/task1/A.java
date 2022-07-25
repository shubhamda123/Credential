package task1;

public class A {

	public static void main(String[] args) {

		System.out.println("main__________start");
		
		//A s=null;
		//System.out.println(s.toString());
		try
		{
			String a="shubham";
			String a1=null;
			A a2=null;
			System.out.println("string="+a.toString());
			
			System.out.println("String null ="+ a1);
			System.out.println("Class type = "+a2);
			
			int y=Integer.parseInt(args[0]);
			System.out.println("y="+y);
			
			int x=10/y;
			System.out.println("x= "+x);
		
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.toString());	
		}
		
		catch(NumberFormatException e) 
		{
			System.out.println("enter non zero value");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("enter non zero value");
		}
	
		
		finally {
			System.out.println("finally block");
		}
		
	
	}

}
