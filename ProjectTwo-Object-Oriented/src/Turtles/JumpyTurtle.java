package Turtles;



public class JumpyTurtle extends SmartTurtle{

	boolean istailup;

	public JumpyTurtle() {
		super();	
		istailup=false;
		
	}


	@Override
	public void tailDown() {
		this.istailup=false;
		super.tailDown();
	}


	@Override
	public void tailUp() {
		this.istailup=true;
		super.tailUp();
	}


	@Override
	public void moveForward(double d) {

		if(this.istailup==true)
		{
			super.moveForward(d);
		}
		
		else{

			for(int i=0;i<(int)d/5;i++)
			{
				if(i%2==0){
					this.tailDown();
					super.moveForward(5);
				}
				else {
					this.tailUp();
					super.moveForward(5);
				}
			}
			super.moveForward(d%5);
			this.tailDown();
		}
	}
	
}
