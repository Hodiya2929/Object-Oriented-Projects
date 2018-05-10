package Turtles;


import java.lang.Math;

import Turtle.SimpleTurtle;


public class DrunkTurtle extends SimpleTurtle {

	public DrunkTurtle() {
		super();
	}

	
	@Override
	public void moveForward(double d) {
		d=Math.random()*2*d;
		double size=Math.random()*30;
		double random=Math.random();
		if (random>0.5)
		{
			this.turnRight((int) size);
		}
		
		else this.turnLeft((int) size);
		
		super.moveForward(d);
	
		
	}
	
	

}
