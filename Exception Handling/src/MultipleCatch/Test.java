package MultipleCatch;

public class Test {

	public static void main(String[] args) {
		 
		try
		{
			String s=args[0];
			System.out.println(s);
		    int x=Integer.parseInt(args[1]);
		    System.out.println(x);
			int a= 10/x;
			System.out.println(a);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter input value");
		}
	
		catch(NumberFormatException e)
		{
			System.out.println("please enter number");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("please enter non zero value");
		}
		System.out.println("main end");

	}

}
