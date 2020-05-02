
class Runner extends Thread{
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println("Runner thread is at = "+x);
		}
	}
}

class Walker extends Thread{
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println("Walker thread is at = "+x);
		}
	}
}

public class MainaThread {
      public static void main(String[] args) {
    	   Runner runner=new Runner();
    	   Walker walker=new Walker();
    	   runner.start();
    	   walker.start();
    	   for(int j=1;j<1000;j++) {
    		   System.out.println("Hey I am main "+j);
    	   }
      }
}
