//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class DIGoAhead implements   Runnable {
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
		   System.out.println(Thread.currentThread().getName()+ " says  keep crying  "+i );	  
		}
	}
}

//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class DIStopPlease implements  Runnable {
	@Override
	public void run() {
		for(int j=1;j<=1000;j++) {
		   System.out.println(Thread.currentThread().getName()+ " says  stop crying  "+j );	  
		}
	}
}


public class DeamonExample {
	
	//Main is non daemon thread!!!!!
	public static void main(String[] args) throws InterruptedException {
		DIGoAhead goAhead=new DIGoAhead();
		DIStopPlease stopPlease=new DIStopPlease();
		Thread thread1=new Thread(goAhead);
		Thread thread2=new Thread(stopPlease);
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		thread1.start();
		thread2.start();
		for(int x=1;x<=10;x++) {
			System.out.println("Jmmmmmmmmmmmmhmmm8383838373 "+x);
		}
		System.out.println("@(@(@(@(@(@(@(@(@(@(@(@@@@@@@@@@@@@");
		System.out.println("**************WELCOME WE HAVE DONE!!!******************************");
		System.out.println("@(@(@(@(@(@(@(@(@(@(@(@@@@@@@@@@@@@");
		
	}
}
