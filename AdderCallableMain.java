
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class AdderCallableMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Here we are creating thread pool of three threads
		//and interfacing it with Executor
		//ExecutorService have more features compare to Executor
		List<Future<Integer>> futureList=new  ArrayList<Future<Integer>>();
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
	    for(int i=1;i<=5;i++){
	    	Callable<Integer> task=new NumAdderCallable();
	    	Future<Integer> result=executor.submit(task);
	    	futureList.add(result);
	    }
	    
	    int total=0;
	    for(Future<Integer> future:futureList){
	    	try {
				total=total+future.get();
			}catch (ExecutionException e) {
				e.printStackTrace();
			} 
	    	catch (InterruptedException e) {
				e.printStackTrace();
			} 
	    }
	    
	    System.out.println("total result = "+total);//75
	    
	    System.out.println("This is magic of concurrent package...........");
	    System.out.println("This is magic of concurrent package...........");
	   

	}

}
