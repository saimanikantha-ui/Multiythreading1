package hello;

public class Multithreading  implements Runnable{
	public void run(){
	for ( int i=0;i<10;i++)
	
	{
		System.out.println("Hello");
	 }
	}
		public static void main(String[] args) {
	 Multithreading obj=new Multithreading();
	 Thread t1=new Thread(obj);
	 t1.start();
		}
		// TODO Auto-generated method stub

	}


