package task1;


public class A {
	public void m1()
	{
		 System.out.println("m1--A");
	}
	
	
    public void add()
    {
    	int a=10;
    	int b=20;
    	int c=a+b;
    	System.out.println("Addition= "+c);
    }
    public static void main(String[] args) {
		A a=new A();
		 a.m1();
		 a.add();
		 
	
   }
}
