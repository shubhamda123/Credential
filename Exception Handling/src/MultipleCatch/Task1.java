package MultipleCatch;

public class Task1 {

	public static void main(String[] args) {

		 try
			{
			   String s1=args[2];// give three String value in arguements
				System.out.println(s1.charAt(2)); 
				
			}
		 
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Please enter input value");
		 }
		
		 
		 System.out.println("main end");
		 
			//check which exception will be occured
			//and handle this exception using try and catch

	}

}
