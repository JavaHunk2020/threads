public class Eater extends Thread{
	private ExecuteMagic executeMagic;	
	
	public Eater(String name,ExecuteMagic executeMagic) {
		super(name);
		this.executeMagic=executeMagic;
	}
	
	@Override
	public void run() {
		System.out.println("hey man  i am Eater");
		executeMagic.karma();
	}
	
}