package Project;

import java.util.Scanner;

public class SBI implements RBI{
	
	Account accountArray[]=new Account[2];
	Scanner sc=new Scanner(System.in);

	int index=0;
	
	public void createAccount() {
		
		for (int i = 0; i < accountArray.length; i++) {
			
			double bal;
			Account ac=new Account();
			System.out.println("enter Account number");
		    long m=sc.nextLong();
			ac.setAccNo(m);
			
			System.out.println("enter Name");
			ac.setName(sc.next()+sc.nextLine());
			
			System.out.println("enter Mobile number");
			ac.setMobNo(sc.next());
			
			System.out.println("enter Adhar number");
			ac.setAdharNo(sc.next());
			
			System.out.println("enter gender");
			ac.setGender(sc.next());
			
			System.out.println("enter age");
			ac.setAge(sc.nextInt());
			
			do {
				System.out.println("At the time of account creation minimum balance must be Rs 1000");
				System.out.println("enter Balance");
				 bal=sc.nextDouble();
			  }
			while(bal<1000.d);
			
			     ac.setBalance(bal);
			      accountArray[i]=ac;
			      index++;
			      
			      System.out.println("Account created succesfully");
			      System.out.println("--------------------------------");    
		}
		 	
	}

	public void displayAllDetails() {
		
		int count=0;
		System.out.println(index);
		if(index>0)
		{
			System.out.println("enter account number");
			long accno=sc.nextLong();
	
		for (int i = 0; i < index; i++) {
			
	     if(accno==accountArray[i].getAccNo())	{
	    	 
	    	 System.out.println("--------------------------------------");
			System.out.println("Acount number = "+accountArray[i].getAccNo());
			System.out.println("Name          = "+accountArray[i].getName());
			System.out.println("Mobile number = "+accountArray[i].getMobNo());
			System.out.println("Adhar number  = "+accountArray[i].getAdharNo());
			System.out.println("gender        = "+accountArray[i].getGender());
			System.out.println("age           = "+accountArray[i].getAge());
			System.out.println("Balance       = "+accountArray[i].getBalance());
			System.out.println("--------------------------------------");
			
		}
	     else
	     {
	    	 count++;
	     }
	 }
	   if(count==index)
	   {
		   System.out.println("Account not found");
	   }
	   else {
		   System.out.println("No account exist in bank");
	   }
    }
  }
	@Override
	public void depositeMoney() {
		
		int count=0;
		if(index>0)
		{
		  System.out.println("enter account number");
		  long accn=sc.nextLong();

		for (int i = 0; i < index; i++) {
			
			if(accn==accountArray[i].getAccNo())
			{
				System.out.println("enter deposite amount");
				double amount=sc.nextDouble();
				double total_balance=accountArray[i].getBalance()+amount;
				accountArray[i].setBalance(total_balance);
				System.out.println("--------------------------------------");
				System.out.println(String.valueOf(amount)+"Deposited Succesfully...!!");
				System.out.println("Total Balence after deposite= "+accountArray[i].getBalance());
				//System.out.println("amount deposted succesfully");
			}
			else
			{
				count++;
			}
		}
		
		if(count==index)
		{
			System.out.println(accn+" Account not found");
		}
		else {
			System.out.println("No account exists in bank..!!");
		}
	}
  }

	

	@Override
	public void withdrawal() {
		
		 
		
	}

	@Override
	public void balanceCheck() {
		 
		
	}
	
	

}
