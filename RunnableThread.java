
//TRunner is thread ??? no 
//TRunner  is Runnable task ??? yes 
class TRunner implements Runnable{
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println("Runner thread is at = "+x);
		}
	}
}

class RWalker implements Runnable{
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println("Walker thread is at = "+x);
		}
	}
}

public class RunnableThread {
      public static void main(String[] args) {
    	  TRunner runner=new TRunner();
    	  RWalker walker=new RWalker();
    	  Thread t1=new Thread(runner);
    	  Thread t2=new Thread(walker);
    	   t1.start();
    	   t2.start();
    	   for(int j=1;j<1000;j++) {
    		   System.out.println("Hey I am main "+j);
    	   }
      }
}
