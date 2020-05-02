

//PackRunner is thread??? no
//This is task ?? yes
class PackRunner implements Runnable{
	@Override
	public void run() {
		Thread   t=Thread.currentThread();
		System.out.println(t);
		  for(int x=0;x<=200;x++) {
			   System.out.println("This PackRunner  and x = "+x);
		  }
	}
}

class SStopper implements Runnable{
	@Override
	public void run() {
		Thread   t=Thread.currentThread();
		System.out.println(t);
		  for(int x=0;x<=200;x++) {
			   System.out.println("This SStopper  and x = "+x);
		  }
	}
}

public class MainS {
	public static void main(String[] args) throws InterruptedException {
		 //who is calling this main method ??? main thread
		Thread   t=Thread.currentThread();
		//5 - is priority of the thread!
		System.out.println( t); //Thread[main,5,main]
		System.out.println(t.getState());
		//Creating more threads
		PackRunner jackRunner=new PackRunner();
		SStopper stopper=new SStopper();
		
		Thread thread1=new Thread(jackRunner);
		Thread thread2=new Thread(stopper);
		
		thread1.start();
		thread2.start();
		
		 for(int x=0;x<=200;x++) {
			   System.out.println("This Main  and x = "+x);
		  }
		 thread1.join();
		 thread2.join();
		 System.out.println("End of main!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
