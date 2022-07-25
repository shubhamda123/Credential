package task3;

public class A3 {

	public static void main(String[] args) {
	
		A3 a=null;
		System.out.println("main__________start");
		try{
			System.out.println("Try------------start");
			System.out.println(a.toString()); // can't give null information by toString method so use NullpointerException
			System.out.println("Try--------------End");
		}
		catch(NullPointerException e){
			System.out.println("catch block--can't give null information by toString method so use NullpointerException");
		}
		System.out.println("main___________end");
		}

	}


