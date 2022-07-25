package task1;

public class VotingClass {
	
	public void voting(int age)throws AgeInvalidException1
	{  //write exception msg here.
		if(age<18)
		{
		   throw new AgeInvalidException1("Not eligible for voting");
		}
		else
		{
			System.out.println("Welcome to Voting");
		}
		
	}  
	public static void main(String args[]){
		
		VotingClass v=new VotingClass();
		//Handle exception and print exception msg here.
		
		try {
	        	v.voting(15);	
	    }  
		catch(AgeInvalidException1 e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
