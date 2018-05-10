package Complexes;

public class Complex {

	double a,b;

	public Complex (double a,double b )
	{
		this.a=a;
		this.b=b;
	}


	public String toString() {
		return   a + "+ i" + b;
	}

	public double module()
	{ 
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	}
	
	public void add (Complex z)
	{
		this.a+=z.a;
		this.b+=z.b;
	}
	
	public void mul (Complex z)
	{
		double temp=this.a;
		this.a= this.a*z.a-this.b*z.b;
		this.b=temp*z.b+z.a*this.b;
	}
	
	public int compare(Complex z)
	{
		double module1=this.module();
		double module2=z.module();
		
		if (module1==module2)
			return 0;
		else if (module1>module2)
			return 1;
		else 
			return -1;
	}

}
