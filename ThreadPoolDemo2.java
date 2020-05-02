
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class TMagic implements Runnable{
	private String name;
	TMagic(String name){
		this.name=name;
	}
	@Override
	public void run() {
			for(int x=1;x<=100;x++) {
				System.out.println("Task name " +name+ " Magic  - x "+x);
			}
	}
}

public class ThreadPoolDemo2 {
	public static void main(String[] args) {
		       Executor exe=  Executors.newCachedThreadPool();
		       exe.execute(new TMagic("Task1"));
		       exe.execute(new TMagic("Task2"));
		       exe.execute(new TMagic("Task3"));
		       exe.execute(new TMagic("Task4"));
		       exe.execute(new TMagic("Task5"));
		       exe.execute(new TMagic("Task6"));
	}
}
