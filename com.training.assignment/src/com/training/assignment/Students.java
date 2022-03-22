package com.training.assignment;
import java.util.Scanner;

public class Students {

	//Create a class Student with following operations
	//1) create parameterized constructor to initialize the objects
	//2) create a function isEqual() to check whether the two objects are equal or not which returns
	//the boolean value and gets two objects
	//3) print the result in main method if objects are equals or not (take variables as your assumtion)
	
	private String name;
	private String roll;
	private double marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	Students(String name,String roll,double marks)
	{
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}
	public static boolean isEqual(Students s1,Students s2)
	{
		boolean b=false;
		if(s1.name==s2.name && s1.roll==s2.roll && s1.marks==s2.marks)
			b=true;
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of first student");
		String a=sc.nextLine();
		System.out.println("Enter the roll number of first student");
		String b=sc.nextLine();
		System.out.println("Enter the marks of first student");
		double c=sc.nextDouble();
		Students s1=new Students(a,b,c);
		System.out.println("Enter the name of second student");
		String x=sc.nextLine();
		System.out.println("Enter the roll number of second student");
		String y=sc.nextLine();
		System.out.println("Enter the marks of second student");
		double z=sc.nextDouble();
		Students s2=new Students(x,y,z);
		boolean B=isEqual(s1,s2);
		if(B==true)
			System.out.println("The students are the same");
		else
			System.out.println("The students are different");
		
		
	}

}


