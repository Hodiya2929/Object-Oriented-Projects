package threads_task3;


public class Ex3 implements Runnable{

	static long number;
	static Boolean result=null;

	public Boolean isPrime(long n, double d) {


		number=n;

		long time=(long)(d*1000);

		Thread prime=new Thread(this);
		prime.setDaemon(true);

		long start=System.currentTimeMillis();
		prime.start();
		long end=System.currentTimeMillis();

		while( (end-start)<time){

			if (result!=null)
				return result;

			end=System.currentTimeMillis();
		}

		throw new RuntimeException();

	}


	@Override
	public void run() {

		result=Ex3_tester.isPrime(number);

	}
}
