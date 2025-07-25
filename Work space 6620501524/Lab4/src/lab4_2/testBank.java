package lab4_2;

public class testBank {
	
	public static void main(String[] args)
	{
		BankAccount A1 = new BankAccount("A1");
		BankAccount A2 = new BankAccount("A2", 500, new Date(1,11,2015));
		
		A1.deposit(1000);
		
		A2.transfer(A1, 300);
		
		A2.withdraw(300);
		
		System.out.println(A1.getInfo() + " amount = " + A1.property());
		System.out.println(A2.getInfo() + " amount = " + A2.property());
		
	}

}
