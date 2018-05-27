package Turtles;


public class TestTurtles {

	public static void main(String[] args) {

	
		DrunkTurtle turtle2=new DrunkTurtle();
		turtle2.tailUp();
		turtle2.moveForward(100);
		

		JumpyTurtle turtle3=new JumpyTurtle();
		turtle3.tailUp();
		turtle3.moveForward(200);
		turtle3.drawSquare(30);
		turtle3.drawPolygon(5, 5);
		
		
		Army turtlrarmy =new Army();
		turtlrarmy.menu();

	}

}
