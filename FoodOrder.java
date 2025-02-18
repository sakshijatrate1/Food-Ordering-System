package org.foodorder;

import java.util.Scanner;

public class FoodOrder {

	int frenchFries=100;
	int burger=120;
	int pasta=130;
	int pizza=160;
	int coldCoffee=50;
	int ch;
	int quantity;
	static int total;
	String again;
	
	Scanner sc=new Scanner(System.in);
	
	//method to display menu card
	public void displayMenu()
	{
		System.out.println("********** Welcome to our Cafe **********");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("      1.FrenchFries        100/- ");
		System.out.println("      2.Burger             120/- ");
		System.out.println("      3.Pasta              130/- ");
		System.out.println("      4.Pizza              160/- ");
		System.out.println("      5.Cold Coffee         50/- ");
		System.out.println("      6.Exit ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("      What do you want to order today?");

	}
	
	//method to generate bill
	public void generateBill()
	{
		System.out.println();
		System.out.println("********** Thank for ordering ***********");
		System.out.println("Your total bill amount is: "+ total +"rs ");
		System.out.println("~~~~~~~~~ Visit again ~~~~~~~~~");
	}
	
	//method to order food
	public void order()
	{
		while(true)
		{	
		System.out.print("Enter your choice: ");
		ch=sc.nextInt();
		
		//for french fries
		switch (ch) {
		case 1:
			System.out.println("You have selected French Fries");
			System.out.println();
			System.out.println("Enter the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*frenchFries;
			break;
		
		//for burger
		case 2:
			System.out.println("You have selected Burger");
			System.out.println();
			System.out.println("Enter the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*burger;
			break;
		
			//for pasta
		case 3:
			System.out.println("You have selected Pasta");
			System.out.println();
			System.out.println("Enter the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*pasta;
			break;
		
		//for pizza
		case 4:
			System.out.println("You have selected Pizza");
			System.out.println();
			System.out.println("Enter the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*pizza;
			break;
		
		//for cold coffee
		case 5:
			System.out.println("You have selected Cold Coffee");
			System.out.println();
			System.out.println("Enter the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*coldCoffee;
			break;
		
		case 6:
			System.exit(1);
			break;

		default:
			break;
		}
		
		System.out.println();
		System.out.println("Do you wish to order anything else? (Y/N): ");
		
		again=sc.next();
		
		if(again.equalsIgnoreCase("Y"))
		{order();}
		else if(again.equalsIgnoreCase("N"))
		{generateBill();
		System.exit(1);}
		else {
			System.out.println("Invalid choice");
		}
	  
	    
	}
	}
}
