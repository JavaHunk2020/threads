
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorRunnable1 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Callable<Integer> task2 = () -> {
        													    System.out.println("Hey I am just starting at..."+LocalDateTime.now());	
        														return 100;
        							};		
      
        System.out.println("Running task1...");
        //run this task after 5 seconds, nonblock for task3
        ScheduledFuture<?>  scheduledFuture=ses.schedule(task2, 5, TimeUnit.SECONDS);
        System.out.println("Running task3...");
        Object on=scheduledFuture.get();
        System.out.println(on);
        ses.shutdown();
    }


}
