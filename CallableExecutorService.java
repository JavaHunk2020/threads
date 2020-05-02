
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Task implements Runnable{
	@Override
	public void run() {
		System.out.println("Hey I am runnable , I cannot return any value to you!!!!!!!!!!!");
	}
}

class Power implements Callable<Integer> {
	
	private String name;
	
	public  Power(String name) {
		this.name=name;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("Executing task "+name);
		int num=new Random().nextInt(100);
		return num;
	}
}

public class CallableExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(4);
		Future<Integer> future1=executorService.submit(new Power("P1"));
		Future<Integer> future2=executorService.submit(new Power("P2"));
		Future<Integer> future3=executorService.submit(new Power("P3"));
		Future<Integer> future4=executorService.submit(new Power("P4"));
		Future<Integer> future5=executorService.submit(new Power("P5"));
		Future<?> future=executorService.submit(new Task());
		Object  o=future.get();
		System.out.println(o);
		int sum=future1.get()+future2.get()+future3.get()+future4.get()+future5.get();
		System.out.println("sum - "+sum);
	}
}
