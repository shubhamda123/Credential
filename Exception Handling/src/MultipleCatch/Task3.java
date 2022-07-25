package MultipleCatch;

public class Task3 {

	public static void main(String[] args) {
 
		
		try
	    { 
		String s1=args[0];//abcde
		System.out.println(s1.charAt(2));//c
		
		String s2=args[1]; // abcde 05
		System.out.println("String s2= "+s2.charAt(0));//0
		
		int f1=Integer.parseInt(s2);//  s2=5
		System.out.println("int f1 ="+f1);
		
		float f2=(float)10/f1;
		System.out.println(f2);//2
	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter input value");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("enter input data");
		}
		catch(NumberFormatException e)
		{
			System.out.println("enter the number");
		}
		catch(ArithmeticException e)
		{
			System.out.println("enter the non zero value");
		}
		
		}

	}


