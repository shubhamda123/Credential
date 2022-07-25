package ProjectUsingArray;

import java.util.Scanner;

public class SBI implements RBI{
	
	Account accountArray[]=new Account[2];
	Scanner sc=new Scanner(System.in);
	int a=0;
	@Override
	public void createAccount() {
	
		for (int i = 0; i < accountArray.length; i++) {
			
			Account ac=new Account();
			System.out.println("enter Account number");
			int m=sc.nextInt();
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
			
			System.out.println("enter Balance");
			ac.setBalance(sc.nextDouble());
			
			      accountArray[i]=ac;
			      System.out.println("Account created succesfully");
			      System.out.println("--------------------------------");
			     a++;
		}
		 	
	}

	@Override
	public void displayAllDetails() {
		
		for (int i = 0; i < accountArray.length; i++) {
			
			System.out.println("Acount number = "+accountArray[i].getAccNo());
			System.out.println("Name          = "+accountArray[i].getName());
			System.out.println("Mobile number = "+accountArray[i].getMobNo());
			System.out.println("Adhar number  = "+accountArray[i].getAdharNo());
			System.out.println("gender        = "+accountArray[i].getGender());
			System.out.println("age           = "+accountArray[i].getAge());
			System.out.println("Balance       = "+accountArray[i].getBalance());
			System.out.println("--------------------------------------");
			
		}
	}
	@Override
	public void depositeMoney() {
		
		int a1=0;
		System.out.println("enter account number");
		int accn=sc.nextInt();
		
		try {
		for (int i = 0; i < accountArray.length; i++) {
			
			
			
			if(accn==accountArray[i].getAccNo())
			{
				System.out.println("enter deposite amount");
				double amount=sc.nextDouble();
				double total_balance=accountArray[i].getBalance()+amount;
				accountArray[i].setBalance(total_balance);
				System.out.println("Total Balence after deposite= "+accountArray[i].getBalance());
				System.out.println("amount deposted succesfully");
				a1++;
			}
			else {
				System.out.println("Account no exist");
			}
		}
		}
		catch(NullPointerException e) {
		if(a==0)
		{
			System.out.println(accn+" Account not found");
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
