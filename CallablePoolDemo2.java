
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallablePoolDemo2 {
	 public static void main(String[] args) throws InterruptedException, ExecutionException {
		 ExecutorService service=Executors.newFixedThreadPool(3);
		 Future<?> future=service.submit(()->{
			System.out.println("P@)_@)@)_@_@_@_@1");
			System.out.println("P@)_@)@)_@_@_@_@1");
			System.out.println("P@)_@)@)_@_@_@_@1");
			System.out.println("P@)_@)@)_@_@_@_@1");
		 });
		 Object b=future.get();
		 System.out.println(b);
		 service.shutdown();
	}
	    
}
