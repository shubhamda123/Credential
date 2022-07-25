package task2;

public class Number {

	public void getNumber(int i)throws ZeroInputException 
	{
		//Write the custom exception here.
		if(i==0) {
         ZeroInputException z=new ZeroInputException("Zero input number ....");
      
          throw z;
	    } 
		else {
			System.out.println("non zero");
		}
   }
}




