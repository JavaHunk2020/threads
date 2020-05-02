
class JackRunner extends Thread{
	
	JackRunner(String tname){
		super(tname);
	}
	@Override
	public void run() {
		Thread   t=Thread.currentThread();
		System.out.println(t);
		  for(int x=0;x<=200;x++) {
			   System.out.println("This JackRunner  and x = "+x);
		  }
	}
}

class Stopper extends Thread{
	
	Stopper(String tname){
		super(tname);
	}
	@Override
	public void run() {
		Thread   t=Thread.currentThread();
		System.out.println(t);
		  for(int x=0;x<=200;x++) {
			   System.out.println("This Stopper  and x = "+x);
		  }
	}
}

public class MainT {
	public static void main(String[] args) throws InterruptedException {
		 //who is calling this main method ??? main thread
		Thread   t=Thread.currentThread();
		//5 - is priority of the thread!
		System.out.println( t); //Thread[main,5,main]
		System.out.println(t.getState());
		//Creating more threads
		JackRunner jackRunner=new JackRunner("James!");
		Stopper stopper=new Stopper("Maks!!");
		jackRunner.start();
		stopper.start();
		
		 for(int x=0;x<=200;x++) {
			   System.out.println("This Main  and x = "+x);
		  }
		 jackRunner.join();
		 stopper.join();
		 System.out.println("End of main!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
