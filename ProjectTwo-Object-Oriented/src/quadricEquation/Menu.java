package quadricEquation;
import java.util.Scanner;

public class Menu {

	static QuadraticEquation solution;

	@SuppressWarnings("resource")
	public static void menu(){

		solution=new QuadraticEquation();
		Scanner myscanner=new Scanner(System.in);
		int x=1;
		double a,b,c;

		do{

			System.out.println("aX^2+bX+c=0: Enter a,b,c: ");
			System.out.print("Enter a: ");
			a=myscanner.nextDouble();	
			System.out.print("Enter b: ");
			b=myscanner.nextDouble();
			System.out.print("Enter c: ");
			c=myscanner.nextDouble();
			System.out.println(a+"x^2"+"+"+b+"x"+c+"=0");

			if (x!=1){
				System.out.println("Bye-bye!");
				myscanner.close();
				return;
			}

			else {

				if(a==0&&b==0&&c==0){

			

						throw new SquareEquationException("x can be any number - trivial!");
			

				}
				else if(a==0&&b==0&&c!=0){
					try{
						throw new SquareEquationException("Error, no answer!!");
					}
					catch(SquareEquationException e){
					e.printStackTrace();
						
					}

				}
				else {

					solution.setQuadraticEquation(a, b, c);
					solution.Calculation();

				}
				System.out.println("\nEnter 0 or any number to Exit or 1 to solve aX^2+bX+c=0: ");
				x=myscanner.nextInt();
			}

		}while(x==1);
		myscanner.close();
		System.out.println("Bye-bye!");

	}
}
