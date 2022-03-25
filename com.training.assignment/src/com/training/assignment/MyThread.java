package com.training.assignment;

public class MyThread extends Thread{

	Thread t;
	String name;
	MyThread()
	{
		super("Child Thread");
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Child Thread is running for the "+i+"th time");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		MyThread parent = new MyThread();
		
		System.out.println("Main Thread is running");
		for(int i=0;i<5;i++) {
			System.out.println("The main thread is running for the "+i+"th time");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
