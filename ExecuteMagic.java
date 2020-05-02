
public class ExecuteMagic {

   synchronized	public String karma() {
		Thread t=Thread.currentThread();
		System.out.println("This karma is called by "+t.getName());
		for(int x=1;x<=1000;x++) {
			System.out.println(t.getName()+ " calls karma is executing!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		return t.getName()+ " is done!!";
	}
	
}
