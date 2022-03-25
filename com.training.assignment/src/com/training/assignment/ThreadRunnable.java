package com.training.assignment;

public class ThreadRunnable implements Runnable {

	
	String name;
	ThreadRunnable(String name)
	{
		this.name=name;
	}	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(name+ " is running ");
				Thread.sleep(500);
			}
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void go()
	{
		Thread t=new Thread(this,name);
		t.start();
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ThreadRunnable th=new ThreadRunnable("MyThread");
		th.run();
	}

}
