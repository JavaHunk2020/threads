
public class PockerEaterMain {

	public static void main(String[] args) {
		ExecuteMagic executeMagic=new ExecuteMagic();
		Pocker pocker=new Pocker("T2",executeMagic);
		Eater eater=new Eater("T1",executeMagic);
		pocker.setPriority(Thread.MAX_PRIORITY);
		eater.setPriority(Thread.MIN_PRIORITY);
		pocker.start();
		eater.start();
		
	}
	
}
