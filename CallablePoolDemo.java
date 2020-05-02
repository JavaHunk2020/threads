import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Jacker implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		 int  result=new Random().nextInt(100);
		return result;
	}
}

public class CallablePoolDemo {
	 public static void main(String[] args) throws InterruptedException, ExecutionException {
		 ExecutorService service=Executors.newFixedThreadPool(3);
		 List< Future<Integer>> resutls=new ArrayList<Future<Integer>>();
		 resutls.add(service.submit(()->new Random().nextInt(100)));
		 resutls.add(service.submit(()->new Random().nextInt(100)));
		 resutls.add(service.submit(()->new Random().nextInt(100)));
		 resutls.add(service.submit(()->new Random().nextInt(100)));
		 resutls.add(service.submit(()->new Random().nextInt(100)));
		 resutls.add(service.submit(()->new Random().nextInt(100)));
		 resutls.add(service.submit(()->new Random().nextInt(100)));
		 int sum=0;
		 for(Future<Integer> result:resutls) {
			 sum=sum+result.get();
		 }
		 System.out.println("Result coming from 7 tasks  "+sum);
		 service.shutdown();
	}
	    
}
