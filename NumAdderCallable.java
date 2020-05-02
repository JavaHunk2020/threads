
import java.util.concurrent.Callable;

public class NumAdderCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=0;i<=5;i++){
			sum=sum+i; //0+1+2+3+4+5=15
		}
		if(sum==100) {
			Exception exception=new Exception("Ohhhh my god what happen?");
			throw exception;
		}
		return sum;
	}
	
}
