
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//Magic is  thread or task
class Magic implements Runnable {
	private String name;
	Magic(String name){
		this.name=name;
	}
	@Override
	public void run() {
			for(int x=1;x<=100;x++) {
				System.out.println("Task name " +name+ " Magic  - x "+x);
			}
	}
}

public class ThreadPoolDemo1 {
	public static void main(String[] args) {
		       Executor exe=  Executors.newCachedThreadPool();
		       exe.execute(new Magic("Task1"));
		       exe.execute(new Magic("Task2"));
		       exe.execute(new Magic("Task3"));
		       exe.execute(new Magic("Task4"));
		       exe.execute(new Magic("Task5"));
		       exe.execute(new Magic("Task6"));
		       System.out.println("@(@*(@*@&*@&");
	}
}
