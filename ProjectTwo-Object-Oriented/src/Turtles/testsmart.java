package Turtles;


public class testsmart {

	public static void main(String[] args) {

			SmartTurtle turtle1=new SmartTurtle();

		turtle1.show();
		turtle1.drawPolygon(3, 45);
		turtle1.tailDown();

		turtle1.drawPolygon(10, 30);
		turtle1.hide();

		DrunkTurtle turtle2=new DrunkTurtle();
		turtle2.tailDown();
		turtle2.moveForward(100);
		

		JumpyTurtle turtle3=new JumpyTurtle();
		turtle3.moveForward(200);
		turtle3.drawSquare(30);
		turtle3.drawPolygon(5, 5);
		
		
		Army turtlrarmy =new Army();
		turtlrarmy.menu();

	}

}
