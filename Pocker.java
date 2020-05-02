public class Pocker extends Thread{
	private ExecuteMagic executeMagic;	
	
	public Pocker(String name,ExecuteMagic executeMagic) {
		super(name);
		this.executeMagic=executeMagic;
	}
	
	@Override
	public void run() {
		System.out.println("hey man  i am pocker");
		executeMagic.karma();
	}
	
}