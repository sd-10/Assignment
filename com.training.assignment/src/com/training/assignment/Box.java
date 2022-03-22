package com.training.assignment;


import java.util.Scanner;

public class Box {
	 //WAP in java to create Box class with parameterized constructor with an object arguement
	 //to initialize length, breadth and height also create a function volume which returns the volume
	 //of the box and print it in main method.
	
	private static double l;
	private static double b;
	private static double h;
	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	Box(Box box)
	{
		//Double[] x=(double) obj;
		this.l=box.l;
		this.b=box.b;
		this.h=box.h;
	}
	
	public static double volume(double l,double b,double h)
	{
		double x=1;
		x=l*b*h;
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the box");
		l=sc.nextDouble();
		System.out.println("Enter the breadth of the box");
		b=sc.nextDouble();
		System.out.println("Enter the height of the box");
		h=sc.nextDouble();
		Box box=new Box(null);
		double a=box.volume(box.l,box.b,box.h);
		System.out.println("The volume of the box is "+a+" cu units");
	}

}

