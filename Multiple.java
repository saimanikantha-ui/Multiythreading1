package hello;

public class Multiple implements Runnable {
	public void run(){
	System.out.println("hdjah");
	}

	public static void main(String[] args) {
	Multiple obj=new Multiple();
	Thread t1=new Thread(obj);
	t1.start();

	}

}
