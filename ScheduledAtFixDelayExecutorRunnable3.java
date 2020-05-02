
import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class ExecuteAgainAndFixAgain implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello I am alive at "+LocalDateTime.now());
	}
}

public class ScheduledAtFixDelayExecutorRunnable3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Runnable task2=new ExecuteAgainAndFixAgain();
        System.out.println("Running task1...");
        //run this task after 5 seconds, nonblock for task3
        //scheduleAtFixedRate
        ScheduledFuture<?>  scheduledFuture=ses.scheduleWithFixedDelay(task2, 3, 2, TimeUnit.SECONDS);
        System.out.println("Running task3...");
        Object on=scheduledFuture.get();
        System.out.println(on);
        ses.shutdown();
    }


}
