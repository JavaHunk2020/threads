
public class Mocha {
	private static int x=0;
   	public static void zee() {
		x=1;
	    synchronized (Mocha.class) {
	           	x=++x + ++x + ++x +x;
		}
		System.out.println("Calling thread id  =  "+Thread.currentThread().getId()+" , Thread Name "+Thread.currentThread().getName()+" , Result = "+x);
	}
}
