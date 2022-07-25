package task2;

public class TestN {

	public static void main(String[] args) {
	 
		Number num = new Number();
		//Handle exception and print exception msg here
		
		try {
			num.getNumber(0);

		}
		catch(ZeroInputException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
