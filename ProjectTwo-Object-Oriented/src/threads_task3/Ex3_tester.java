package threads_task3;

public class Ex3_tester {

	/** This class represents a basic implementation for Ex3testing file. */

	public static double ENDLESS_LOOP=0.4;

	public static void main(String[]args){
		
		Ex3 ex3=new Ex3();

		long n=33333331L;
		boolean ans=ex3.isPrime(n,0.01);
		System.out.println("n="+n+" isPrime "+ans);
	}

	/** DONOT change this function!,it must be used
	 * byEx3-isPrime(long,double) */

	public static boolean isPrime(long n){
		boolean ans=true;
		if(n<2)throw new RuntimeException("ERR: the parameter to the isPrime function must be >1 (got "+n+")!");
		int i=2;
		double ns=Math.sqrt(n) ;
		while(i<=ns&&ans){
			if (n%i==0)
				ans=false;
			i=i+1;
		}

		if(Math.random()<Ex3_tester.ENDLESS_LOOP)//responsible to enter the program into endless loop
			while(true);

		return ans;
	}}
