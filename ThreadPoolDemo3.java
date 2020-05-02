
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class OMagic implements Runnable{
	private String name;
	OMagic(String name){
		this.name=name;
	}
	@Override
	public void run() {
			for(int x=1;x<=100;x++) {
				System.out.println("Task name " +name+ " Magic  - x "+x);
			}
	}
}

public class ThreadPoolDemo3 {
	public static void main(String[] args) {
		       Executor exe=  Executors.newSingleThreadExecutor();
		       exe.execute(new OMagic("Task1"));
		       exe.execute(new OMagic("Task2"));
		       exe.execute(new OMagic("Task3"));
		       exe.execute(new OMagic("Task4"));
		       exe.execute(new OMagic("Task5"));
		       exe.execute(new OMagic("Task6"));
	}
}
