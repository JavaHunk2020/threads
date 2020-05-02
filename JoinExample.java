
//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class TIGoAhead implements   Runnable {
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
		   System.out.println(Thread.currentThread().getName()+ " says  keep crying  "+i );	  
		}
	}
}

//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class TIStopPlease implements  Runnable {
	@Override
	public void run() {
		for(int j=1;j<=100;j++) {
		   System.out.println(Thread.currentThread().getName()+ " says  stop crying  "+j );	  
		}
	}
}


public class JoinExample {
	public static void main(String[] args) throws InterruptedException {
		TIGoAhead goAhead=new TIGoAhead();
		TIStopPlease stopPlease=new TIStopPlease();
		Thread thread1=new Thread(goAhead);
		Thread thread2=new Thread(stopPlease);
		thread1.start();
		thread2.start();
		for(int x=1;x<=10;x++) {
			System.out.println("Jmmmmmmmmmmmmhmmm8383838373 "+x);
		}
		
		//Main thread wants to wait other threads 
		thread1.join(); // here main thread will join thread1 and thread2
		thread2.join();
		System.out.println("@(@(@(@(@(@(@(@(@(@(@(@@@@@@@@@@@@@");
		System.out.println("**************WELCOME WE HAVE DONE!!!******************************");
		System.out.println("@(@(@(@(@(@(@(@(@(@(@(@@@@@@@@@@@@@");
		
	}
}
