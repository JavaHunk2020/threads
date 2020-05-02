
class Jocker extends Thread {
	
	public Jocker(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int x = 1; x <= 10; x++) {
					Mocha.zee();
		}
	}
}

class TPocker extends Thread {
	public TPocker(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int x = 1; x <= 10; x++) {
					Mocha.zee();
		}
	}
}

public class AsynchThreads {
	public static void main(String[] args) {
			new Jocker("Jocker").start();
			new TPocker("Pocker").start();
	}
}
