
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;


class Agora implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		System.out.println("Hey!   I am very poor task!!!!!!!!!!!!!!!!" + LocalDateTime.now());
		return 444;
	}
}

class Runna implements Runnable{
	@Override
	public void run()  {
		System.out.println("Running task2..."+LocalDateTime.now());
	}
}

public class ScheduledExecutorRunnable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Runnable task2 = new Runna();
        task1();
        //run this task after 5 seconds, nonblock for task3
        ses.schedule(task2, 5, TimeUnit.SECONDS);
        task3();
        
        ScheduledFuture<Integer> scheduledFuture=ses.schedule(new Agora(),10,TimeUnit.SECONDS);
        int result=scheduledFuture.get();
        System.out.println("Result is result = "+result);
        ses.shutdown();

    }

    public static void task1() {
        System.out.println("Running task1...");
    }

    public static void task3() {
        System.out.println("Running task3...");
    }

}
