class Account
{
	int acc_no;
	String name;
	float amount;
	void insert(int a,String n,float amt)
	{
		acc_no=a;
		name=n;
		amount=amt;
	}
	void deposite(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+"Deposited");
	}
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Sufficient Balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"Withdraw");
		}
	}
	void CheckBalance()
	{
		System.out.println("Balance is"+amount);
	}
	void display()
	{
		System.out.println("acc_no+"+name+"+amount");
	}
}
class TestAccount
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.display(000000,"Vijay",10,00,000);
		a1.display();
		a1.Checkbalance();
		a1.deposite();
		a1.checkBalance();
		a1.withdraw(15,000);
		a1.CheckBalance();
	}
}