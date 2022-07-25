package task4;

public class A4 {

	public static void main(String[] args) {
 
			A4 a=null;
			System.out.println("main__________start");
			try{
				System.out.println("Try------------start");
				System.out.println(a.toString());
				//int a1=10/0;
				System.out.println("Try--------------End");
			}
			catch(Exception e){
				System.out.println(e.toString());// it gives which exception occur
				System.out.println("catch block");
			}
			System.out.println("main___________end");
		}
}





