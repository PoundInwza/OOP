package lab3;

import java.util.Scanner;

public class lab1 {

	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Book book1 = new Book();
		book1.name = " Harry Potter and The Chamber of Secret";
		book1.author = "J.K. Rowling ";
		book1.year = 2542;
		
		System.out.println("Book: " + book1.name); 
		System.out.println("Written by " + book1.author + book1.year); 
		

	}
	
}
