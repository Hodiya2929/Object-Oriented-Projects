package Turtles;

import java.util.Scanner;

import Turtle.SimpleTurtle;

public class Army extends SimpleTurtle {

	SimpleTurtle army[];
/**
 * This Method execute the final task of part 1, its create an array
 * of size 5 and for each insertion of the user its create the object in 
 * the matching index.
 *
 */
	public void menu()
	{
		SimpleTurtle army[]=new SimpleTurtle[5];

		Scanner myscanner=new Scanner(System.in);	
		
		for (int y=0;y<5;y++)
		{

		int x=1;
		
		System.out.println("Choose the type of a turtle:\n 1. Simple\n2. Smart\n3. Drunk\n4. Jumpy");

		x=myscanner.nextInt();
		

		while (x!=1&&x!=2&&x!=3&&x!=4)
		{
			System.out.println("Wrong insertion!");
			System.out.println("Choose the type of a turtle:\n 1. Simple\n2. Smart\n3. Drunk\n4. Jumpy");
			x=myscanner.nextInt();
		}

		
				if (x==1)
					army[y]=new SimpleTurtle();		
				if (x==2)
					army[y]=new SmartTurtle();	
				if (x==3)
					army[y]=new DrunkTurtle();	
				if (x==4)
					army[y]=new JumpyTurtle();
			}
		

		myscanner.close();

		for ( int y=0;y<5;y++)
		{
			army[y].tailDown();
		}

		for ( int y=0;y<5;y++)
		{
			army[y].moveForward(100);
		}

		for ( int y=0;y<5;y++)
		{
			army[y].turnRight(90);
		}

		for ( int y=0;y<5;y++)
		{
			army[y].moveForward(60);
		}
		for ( int y=0;y<5;y++)
		{
			/**
			 * imanuel
			 * ëàï çåáä ìäùúîù á÷ñèéðâ ëé äîåøéù
			 *  ìëì äöáéí äåà öá ôùåè åìöá ôùåè àéï àú äúëåðåú ùì öéåø îøåáò åîöåìò òì 
			 *  ëï çåáä ìäùúîù á ÷ñèéðâ ëï äàåáé÷è î÷áì àú äàôùøåú ìâéùä ìîúåãåú ùì öá çëí 
			 *  
			 */
			/**
			 * äùéîåù áôåìéîåøôéæí áà ìéãé áéèåé áîñôø ÷øéàåú
			 * ôåìéîåøôéæí äåà ééùåí ùì àåúä äîúåãä áãøëéí ùåðåú
			 * ðéúï ìøàåú ùëàùø öá ùéëåø ÷åøà ìôåð÷öéä ùì öéåø îøåáò åîöåìò
			 * äåà àéðå îééùí àú æä ëîå öá çëí, ëé áúåê äîúåãä ùì öá çëí 
			 * áöéåø øéáåò éù ÷øéàä ìîúåãä ùì ìæåæ ÷ãéîä åöá ùéëåø 
			 * îééùí àú äîúåãä ùì äîçì÷ä ùìå
			 */
			if (army[y] instanceof SmartTurtle||army[y] instanceof JumpyTurtle)
			{
				((SmartTurtle)army[y]).drawPolygon(6, 70);
			}
		}
		for ( int y=0;y<5;y++)
		{
			army[y].hide();
		}


	}
}
