package quadricEquation;

public class QuadraticEquation {


	double a,b,c;


	public QuadraticEquation() {

		a=1;
		b=1;
		c=1;
	}

	public void  setQuadraticEquation(double x,double y,double z) {

		a=x;
		b=y;
		c=z;
	}


	public void Calculation() throws SquareEquationException{

		double temp=Math.sqrt((b*b)+(-4.0*a*c));
		double x1,x2;
		
		if(a==0&&b!=0&&c!=0)
			System.out.println("x1=x2="+(-c)/b);

		else if(temp>0){
			x1=(-b+temp)/(2*a);
			x2=(-b-temp)/(2*a);
			System.out.print("x1="+x1+"       x2="+x2);
		}


		else if (temp==0){
			x1=(-b/2*a);
			if(x1==0)
				System.out.println("x1=x2="+Math.abs(x1));
			else
				System.out.println("x1=x2="+x1);
						
		}

		else{

			try{

				throw new SquareEquationException("Error: NO real roots!");
			}

			catch(SquareEquationException e){
			e.printStackTrace();
			}


		}
	}

}


