

 class Home {
	static private int x = 1;
	public synchronized static void print() {
		x++;
		x++;
		System.out.println(Thread.currentThread().getName() +" =  Value of x is  = " + x);
	}
}

class T1 extends Thread {
	public T1() {
		 this.start();
	}
	@Override
	public void run() {
		for(int x=1;x<=1000;x++) {
			   Home.print();
		}
	}
}

class T2 extends Thread {
	public T2() {
		 this.start();
	}
	@Override
	public void run() {
		for(int x=1;x<=1000;x++) {
			  //again and again
			   Home.print();
		}
	}
}


public class HomeThread {
  
	public static void main(String[] args) {
		new T1();
		new T2();
	}
}
