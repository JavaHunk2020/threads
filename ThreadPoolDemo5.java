
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class NumGen implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		int num=new Random().nextInt(1000);
		return num;  // auto boxing
	}
}


public class ThreadPoolDemo5 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		       ExecutorService exe=  Executors.newFixedThreadPool(5);
		       List<Future<Integer>> results=new ArrayList<>();
		       System.out.println("HMMMMMMMMMMMMMMMMMMMM");
		       System.out.println("HMMMMMMMMMMMMMMMMMMMM");
		       System.out.println("HMMMMMMMMMMMMMMMMMMMM");
		       
		       for(int x=1;x<=20;x++) {
		    	   Future<Integer> result=exe.submit(new NumGen());
		    	   results.add(result);
		       }
		       //All tasks will execute as same time
		       int sum=0;
		       for(Future<Integer> tt : results) {
		    	   sum=sum+tt.get();
		       }
		       System.out.println("Hey main  please wait here for 2 minutes at max");
		       exe.awaitTermination(3,TimeUnit.SECONDS); //who is waiting ? main - 
		       System.out.println("sum  = "+sum);
		       exe.shutdown();
	}
}
