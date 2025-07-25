package lab4_2;

public class BankAccount {
	
	private String name;
	private double money;
	
	private Date date;
	
	public BankAccount(String name) {
		this.name = name;
		money = 0;
		this.date = new Date(25,7,2025);
	}
	
	public BankAccount(String name, double amount, Date date) {
		this.name = name;
		this.money = amount;
		this.date = date;
	}
	
	void deposit(double amount)
	{
		money += amount;
	}
	
	boolean withdraw(double amount)
	{
		if(amount <= money)
		{
			money -= amount;
			return true;
		}
		
		return false;
	}
	
	void transfer (BankAccount other, double amount)
	{
		if(withdraw(amount))
		{
			other.deposit(amount);
		}
	}
	
	double  property()
	{
		return money;
	}
	
	String getInfo()
	{
		return this.name + " " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + "/" ;
	}
}
