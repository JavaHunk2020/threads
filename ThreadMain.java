
public class ThreadMain {
	
	//This main method is called  by "main" thread
	//who creates main thread ? JVM
	//who creates JVM ?? java command 
	//Java commands comes with JRE
	//JRE is as software 
	public static void main(String[] args) {
		//accessing the reference of thread who calls this method
		Thread  t=Thread.currentThread();
		System.out.println("Thread id = "+t.getId());
		System.out.println("Thread name = "+t.getName());
		System.out.println("Thread State = "+t.getState());	
	}

}
