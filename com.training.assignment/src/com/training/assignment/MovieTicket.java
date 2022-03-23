package com.training.assignment;

import java.util.Scanner;

public class MovieTicket {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to the  movie ticket reservation app");
			System.out.println("The  available theaters are");
			System.out.println("***********1.Lakshmi**********");
			System.out.println("***********2.Alankar**********");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			if(choice==1) 
			{
				System.out.println("Enter into the lakshmi theater");
				System.out.println("Select a movie");
				System.out.println("We have two movies");
				System.out.println("1.Sankranthi  *****    2.Singham");
				System.out.println("Enter the choice");
				int choice2=sc.nextInt();
				if(choice2==1) 
				{
					System.out.println("sankranthi movie in lakshmi theater");
					System.out.println("how many tickets to be booked********** each cost 80rs");
					int n=sc.nextInt();
					System.out.println("the total cost is"+n*80+"rs");
				}
				else if(choice2==2) 
				{
					System.out.println("singam movie in laksmi theater theater");
					System.out.println("how many tickets to be booked********** each cost 80rs");
					int n=sc.nextInt();
					System.out.println("the total cost is"+n*80+"rs");
					
				}
				else
					System.out.println("Wrong Choice");
				
				
			}
			else if(choice==2)
			{
				System.out.println("Enter into the alankar theater");
				System.out.println("Select a movie");
				System.out.println("We have two movies");
				System.out.println("1.Drushyam  *****    2.Mirchi");
				System.out.println("Enter the choice2");
				int choice2=sc.nextInt();
				if(choice2==1) 
				{
					System.out.println("Drushyam movie in alankar theater");
					System.out.println("How many tickets to be booked********** each cost 100rs");
					int n=sc.nextInt();
					System.out.println("The total cost is"+n*100+"rs");
				}
				else if(choice2==2) 
				{
					System.out.println("mirchi  movie in alankar theater");
					System.out.println("how many tickets to be booked********** each cost 150rs");
					int n=sc.nextInt();
					System.out.println("the total cost is"+n*150+"rs");
					
				}
				else
					System.out.println("Wrong Choice");			
		}
			else
				System.out.println("Wrong Choice");
	sc.close();
	}
}


