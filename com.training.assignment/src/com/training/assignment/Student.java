package com.training.assignment;

import java.util.Scanner;

public class Student {

	private static final Exception RangeException = null;
	public static String name;
	Student()
	{
		
	}
	public static void main(String args[]) throws Exception
	{
		double marks[]=new double[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		name=sc.nextLine();
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter the marks ");
			marks[i]=sc.nextDouble();
		}
		double sum=0;
		for(int i=0;i<6;i++)
		{
			if(marks[i]>=0 && marks[i]<=50)
			{
				
				sum+=marks[i];
				
			}
			else
				{
					System.out.println("Marks cant be lesser than 0 or be greater than 50");
					throw RangeException;
					
				}
		}
		double p;
		p=(sum/300)*100;
		System.out.print(name+"'s");
		System.out.println(" Percentage= "+p+"%");
	}
}
