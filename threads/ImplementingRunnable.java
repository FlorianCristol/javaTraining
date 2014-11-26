public class ImplementingRunnable implements Runnable{

	public void run(){
		System.out.println("Running from an implemented Runnable interface");
	}
	public static void main(String args[]){
		new Thread(new ImplementingRunnable()).start();
	}
}