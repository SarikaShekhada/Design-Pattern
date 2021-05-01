import java.util.Scanner;
abstract class BankAccount
{
	double balance; 
	int numberOfDeposits;
	int numberOfWithdraws;
	double amount;
	
	public BankAccount(double  bal)
	{
		balance=bal;
	}
	
	public void setAmount(double myAmount)
	{
		amount=myAmount;
	}
	
	public void deposit(double amountIn)
	{
		balance=balance + amountIn;
		numberOfDeposits++;
	}
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
		numberOfWithdraws--;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getDeposits()
	{
		return numberOfDeposits;
	}
	
	public double getWithdraws()
	{
		return numberOfWithdraws;
	}
}

class SavingAccount extends BankAccount
{ 
	public SavingAccount(double b)
	{
		super(b);
	}
	
	public boolean isActive()
	{
		if(balance>=25)
			return true;
		return false;
	}
	
	public void withdraw()
	{
		if(isActive()==true)
		{
			super.withdraw(amount);
		}
	}
	
	public void deposit()
	{
		if(isActive()==true)
		{
			super.deposit(amount);
		}
	}
}

class CurrentAccount extends BankAccount
{
	public CurrentAccount(double b)
	{
		super(b);
	}
	
	public boolean isActive()
	{
		if(balance>=25)
			return true;
		return false;
	}
	
	public void withdraw()
	{
		if(isActive()==true)
		{
			super.withdraw(amount);
		}
	}
	
	public void deposit()
	{
		if(isActive()==true)
		{
			super.deposit(amount);
		}
	}
}

class MyBank
{
	public static void main(String args[])
	{
		SavingAccount sa=new SavingAccount(5000);
		CurrentAccount ca=new CurrentAccount(2000);
		
		System.out.println("Saving Account:");
		sa.withdraw(2000);
		sa.deposit(10);
		
		
		
		System.out.println("Current Account:");
		ca.withdraw(300);
		ca.deposit(600);
		System.out.println(ca.getBalance());
	}
}	


