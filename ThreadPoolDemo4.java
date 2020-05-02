
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class EMagic implements Runnable{
	private String name;
	EMagic(String name){
		this.name=name;
	}
	@Override
	public void run() {
			for(int x=1;x<=4;x++) {
				System.out.println("Task name " +name+ " Magic  - x "+x); 
			}
	}
}

public class ThreadPoolDemo4 {
	public static void main(String[] args) throws InterruptedException {
		       ExecutorService exe=  Executors.newFixedThreadPool(3);
		       exe.execute(new EMagic("Task1"));
		       exe.execute(new EMagic("Task2"));
		       exe.execute(new EMagic("Task3"));
		       exe.submit(new EMagic("Task4"));
		       exe.submit(new EMagic("Task5"));
		       exe.submit(new EMagic("Task6"));
		       exe.shutdown();
		       exe.awaitTermination(5,TimeUnit.SECONDS); //who is waiting ? main - 
		       System.out.println("@@(@(@(AHAHAHAHAHAHAHAHHAHA WE HAVE DONE!");
		      // exe.execute(new EMagic("Task7"));
	}
}
