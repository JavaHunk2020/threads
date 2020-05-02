
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

class MyRunnable implements Runnable {
	 private AtomicInteger at;
	 public  MyRunnable(AtomicInteger at){
		 this.at=at;
	 }

	public void run() {
		System.out.println("Welcome Run Method = "+Thread.currentThread().getId());
		 int myCounter;
		 int myPrevCounter;
		 int myCounterPlusFive;
		 boolean isNine;
		 PrintWriter pw=null;
		 try {
			 pw=new PrintWriter("logger"+Thread.currentThread().getId()+".txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pw.println(new Date()+" = "+"Thread executing.................................=>>>" + Thread.currentThread().getId());
		myCounter = at.incrementAndGet();
		pw.println(new Date()+" = "+"Thread " + Thread.currentThread().getId() + "  / Counter : " + myCounter);
		myPrevCounter = at.getAndIncrement();
		pw.println(new Date()+" = "+"Thread " + Thread.currentThread().getId() + " / Previous : " + myPrevCounter); 
		myCounterPlusFive = at.addAndGet(5);		//7
		pw.println(new Date()+" = "+"Thread " + Thread.currentThread().getId() + " / plus five : " + myCounterPlusFive);
		isNine = at.compareAndSet(9, 3);
		if (isNine) {
			pw.println(new Date()+" = "+"Thread " + Thread.currentThread().getId() 
					+ " / Value was equal to 9, so it was updated to " + at.intValue());
		}
		if(pw!=null){
			pw.close();
		}

	}
}

public class AtomicIntegerExample {
	public static void main(String... args) {
		 AtomicInteger at=new AtomicInteger(0);
		Thread t1 = new Thread(new MyRunnable(at));
		Thread t2 = new Thread(new MyRunnable(at));
		t1.start();
		t2.start();
	}
}