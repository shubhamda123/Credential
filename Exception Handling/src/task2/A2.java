package task2;

public class A2 {

	public static void main(String[] args) {
		
		System.out.println("main__________start");
		A2 a=null;
		//System.out.println(a.toString());
		try{
			System.out.println("Try------------start");
			System.out.println(a.toString()); // toString method gives information of object
			System.out.println("Try--------------End");
		}
		catch(NullPointerException e){
			
			System.out.println("catch block");
			
		}
		System.out.println("main___________end");
		}


	
	}


