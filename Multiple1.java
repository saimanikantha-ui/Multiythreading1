package hello;

class M implements Runnable {
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("Hi");
		}
	}}
 class Cas implements Runnable{
public void run()
{
	for(int i=0;i<=20;i++)
	{
		System.out.println("Hello");
	}
}
 }
class Multiple1 implements Runnable{
	public void run()
	{
		for(int i=0;i<=25;i++)
			
		{
			System.out.println("*");
		}
	}

	public static void main(String[] args) {
		Multiple1 obj=new Multiple1();
		Thread t1=new Thread(obj);
		M obj1=new M();
		Thread t2=new Thread(obj1);
		t1.start();
		t2.start();
		Cas obj2 =new Cas();
		Thread t3=new Thread(obj2);
		t3.start();

	}

	}
 


