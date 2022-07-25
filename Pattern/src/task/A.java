package task;

public class A {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)   //rows
		{
			for(int j=4; j>=1;j--)   //
		  {
			 if(j>i)
			 {
				 System.out.print(" ");
			 }
			 
			 else
			 {
				 System.out.print(" *");
			 }
		  }	
		System.out.println();
		}
	System.out.println("---------------------------");
	
	
	for(int i=1;i<=4;i++)
	{
		for (int j = 1; j<=i; j++) 
		{
			System.out.print(" ");
		}
		for(int k=4; k>=i; k--)
		{
			System.out.print("*");
		}

		for(int p=3; p>=i; p--)
		{
			System.out.print("*");
		}
	System.out.println();
	}
	System.out.println("-------------------------------");
	
	for(int i1=1;i1<=4;i1++)
	{
		for (int j = 1; j<=i1; j++) 
		{
			System.out.print(" ");
		}
		for(int k=4; k>=i1; k--)
		{
			System.out.print(i1);
		}

		for(int p=3; p>=i1; p--)
		{
			System.out.print(i1);
		}
	System.out.println();
					
	}
	
		
		
  }

	}

