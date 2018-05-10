/**
 * This package includes all of our part 1 project
 */
package Turtles;


import Turtle.*;
/**
 * 
 * @author Yehuda Shiller and Imanuel Sinwany.
 *
 */

public class SmartTurtle extends SimpleTurtle {
	
	/**
	 * Class SmartTurtle extends SimpleTurtle - the rest of
	 * the classes will extends this classes. A smart turtle 
	 * has in addition to extended class function, two other function.
	 */
	
	public SmartTurtle() {
		super();	
	}
	

/**
 * 
 * @param size - determine the size of the square, that the turtle is 
 * about to move.
 */
	public void drawSquare(double size)
	{
	
		moveForward(size);
		turnRight(90);
		moveForward(size);
		turnRight(90);
		moveForward(size);
		turnRight(90);
		moveForward(size);
		
	}
	/**
	 * 
	 * @param sides determine how many sides the polygon have.
	 * @param size determine the size of each side.
	 */
	public void drawPolygon (int sides, double size)
	{ 
		
		double x =360/(sides);
		for (int j = 0; j < sides; j++) {
			
		
		moveForward(size);
		turnRight((int) x);
		
		}
	}
	
	
	
	
}
