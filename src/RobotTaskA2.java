import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

public class RobotTaskA2 {

	public void run() {
		// TODO Auto-generated method stub
		
		City mC = new City (10, 10); // creates a city with a size of 10 by 10
		
		SketchRobot eB = new SketchRobot (mC, 3, 4, Direction.SOUTH);// avenue = x-axis, street = y-axis
		
		eB.sketch(); // calls the sketch method to sketch the image when the program is read
		
		
	}

}
