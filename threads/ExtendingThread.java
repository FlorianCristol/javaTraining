public class ExtendingThread extends Thread{
	public void run(){
		System.out.println("Hello from extended Thread class");
	}
	public static void main(String args[]){
		new ExtendingThread().start();
	}
}
