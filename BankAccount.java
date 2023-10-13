package BankManagment;

import java.util.Scanner;
//import java.util.*;
public class BankAccount {
	
	
	private String name;
	private String CustomerId ;
	private int accountNumber;
	private double Balance;
	private String email;
	
	// Constructor.
	public BankAccount(String name, String CustomerId , int accountNumber, double Balance, String email)
	{
		this.name=name;
		this.CustomerId = CustomerId;
		this.accountNumber = accountNumber;
		this.email=email;
		
		this.Balance = Balance;
	}

	 // Get all data.
	public void getAllDetails(String name, int accountNumber) {
		System.out.println("Name = "  +this.name );
		System.out.println("Account Number = " +this.accountNumber );
		
	}
	
	// Check Account Number
	public void checkAccountNumber() {
		System.out.println("Enter your Account Number : ");
		Scanner scan = new Scanner(System.in);
		int enterAccountNum = scan.nextInt();
		if(enterAccountNum == accountNumber) {
			System.out.println(accountNumber+" is Correct Account Number");
			getAllDetails( name, accountNumber);
			//convertintoDoller();
			
			menu();
		}
		else {
			System.out.println("not matched");
		}
	}
	
	// Check Balance
	public void checkBalance() {
		double TotalDoller = 0;
		 //  double OneDoller =78;
		   TotalDoller= this.Balance/78;
		   
		System.out.println("Your avaliable balance is "+TotalDoller);
		
		menu();
	}
	
	public void convertintoDoller() {
	   double TotalDoller = 0;
	 //  double OneDoller =78;
	   TotalDoller= this.Balance/78;
	   System.out.println(TotalDoller);
	}
	
	// Deposite Money.
	
	public void DepositeMoney() {
		System.out.println("Enter your Money ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextInt();
	
		this.Balance += amount;
		System.out.println("your " +amount +" is credit successfuly in your bank account.");
		System.out.println("your Available balnce is : "+this.Balance);
		menu();
	}
	
	// Withdraw money
	public void WithdrawMoney() {
		System.out.println("Enter your Money ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		if (amount < Balance) {
		Balance= Balance-amount;
		System.out.println("your " +amount +" is withdraw successfuly in your bank account.");
		System.out.println("your Available Balance is :"+this.Balance);
		menu();
	    }
		else {
			System.out.println("Insufficent fund");
			
		}
	
  }
	
	public void Exist() {
		
		System.out.println("Thank you");
		return;
	}
	
	public void menu() {
		System.out.println("select your option what you want : ");
		
		
		System.out.println("1.check your A/c Blanace ");
		System.out.println("2.Deposite money");
		System.out.println("3.withdraw money");
		System.out.println("4.Exist");
		
		Scanner scan = new Scanner(System.in);
		int opt = scan.nextInt();
		
		if (opt==1) {
			checkBalance();
			
		}else if (opt==2) {
			DepositeMoney();
		}else if (opt==3) {
			WithdrawMoney();
		}else if (opt==4) {
			Exist();
		}
	}
	
	public static void main(String[] args) {
		
	
   BankAccount Account1= new BankAccount(" Ashutosh yadav" ,"CustomerId : 12345", 102030, 2000.00 ," Email : ashu@gmail.com");
	
   BankAccount Account2= new BankAccount(" Riya Sharma" ,"CustomerId : 129080", 908070, 200990000.00 ," Email : ashu@gmail.com");

   BankAccount Account3 = new BankAccount("Aniket Sharma","CustomerId : 32201222", 909090, 20000.00," Email : aniketsharma@gmail.com");
	
	Account1.checkAccountNumber();
	Account2.checkAccountNumber();
	Account3.checkAccountNumber();
	//Account1.WithdrawMoney();
	//Account1.DepositeMoney();
  }

}