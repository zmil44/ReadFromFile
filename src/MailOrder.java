/*
 * Zachary Miller
 * Assignment 9.1
 * MailOrder.java
 * 08/07/2018
 * THis program takes user input and saves it to a file
 * Bellevue University
 * 
 */
import java.util.Scanner;
import java.io.*;
public class MailOrder {



	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		
		PrintWriter file = new PrintWriter(new File("data.txt"));
		
		String next;
		boolean keepGoing=true;
		
		while(keepGoing==true)
		{
			System.out.print("Enter item number or q to quit: ");
			next = scan.next();
		
			if(next.equals("q"))
			{
				break;
			}
		
		int itemNum = Integer.parseInt(next);
		
		System.out.print("Enter the quantity: ");
		int quantity = scan.nextInt();
		
		file.println(itemNum+"\t"+quantity);		
		}
		file.close();
		
	}	
}
