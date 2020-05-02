
import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ExecuteAgainAndAgain implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello I am alive at "+LocalDateTime.now());
	}
}

public class ScheduledAtFixExecutorRunnable2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
		System.out.println("Running task1...");
		// run this task after 5 seconds, non block for task3
		ses.scheduleAtFixedRate(new ExecuteAgainAndAgain(), 3, 2, TimeUnit.SECONDS);
		System.out.println("Running task3...");
		//ses.shutdown();
	}
}
