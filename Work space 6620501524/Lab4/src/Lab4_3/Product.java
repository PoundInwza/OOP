package Lab4_3;

import java.util.Scanner;

public class Product {
	
	private String name;
	private int code;
	private double price;
	
	public Product(int code, String name, double price) 
	{
		this.name = name;
		this.code = code;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] products = new Product[5];
		
		products[0] = new Product(0, "Mama", 5.5);
		products[1] = new Product(10, "Lays", 10.5);
		
		System.out.println("======== Enter Products detail========");
		for(int i=0, j=20; i<3 ; i++, j+=10)
		{
			int c;
			double p;
			String x;
			
			System.out.println("Product Code : " + j);
			System.out.print("name : ");
			x = sc.nextLine();
			System.out.print("price : ");
			p = sc.nextDouble();
			sc.nextLine();
			
			products[i+2] = new Product(j, x, p);
		}
		
		System.out.println("========== List of Products ==========");
		for(int i=0; i<5 ; i++)
		{
			System.out.println("Product Code : " + products[i].getCode());
			System.out.print("name : " + products[i].name + " , ");
			System.out.println("price : " + products[i].price);
			System.out.println();
		}
		
		System.out.println("========== List of Products ==========");
		System.out.println("Enter product code (press -1 to exit)");
		double checkout = 0;
		while(true)
		{
			int c;
			int amount;
			
			System.out.print("Product Code : ");
			c = sc.nextInt();
			if(c==-1)
				break;
			
			System.out.print("Amount of " + products[c/10].getName() + " : ");
			amount = sc.nextInt();
			
			checkout += amount * products[c/10].getPrice();
		}
		
		System.out.printf("You have to pay %.2f Bath", checkout);
		
	}
}
