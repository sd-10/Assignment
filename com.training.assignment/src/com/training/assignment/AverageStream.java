package com.training.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the 5 numbers you want to find the average of: ");
		for(int i=0;i<5;i++)
			list.add(sc.nextInt());
		double x=0;
		x=list.stream().mapToInt(i ->i).sum();
		
		System.out.println("The numbers you entered are: "+list);
		System.out.println("Their average is:");
		System.out.println((x/5));
		sc.close();
	}

}
