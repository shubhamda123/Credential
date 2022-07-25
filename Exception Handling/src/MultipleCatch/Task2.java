package MultipleCatch;

public class Task2 {

	public static void main(String[] args) {

		try
		{
			 String s1=args[0];
		

		System.out.println(s1.charAt(2));
		String s2=null;
		System.out.println(s2.length()); // it cannot execute because String is null 
	
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("please enter input value");
		}
		
		catch(NullPointerException a)
		{
			System.out.println(a.toString());
			System.out.println("Null pointer exception got");
		}
		System.out.println("MAIN end");
		}

	}

	


