package uk.co.news.international;

import java.util.List;

/**
 * This class represent the Plateau
 * @author Arsalan
 *
 */
public class Plateau {
	//end points included
	private Coordinate upperRightCoordinates;
	
	private Robot robot = null;

	public Plateau(Coordinate coordinate, Robot robot) {
		upperRightCoordinates = coordinate;
		this.robot = robot;
		if(!isInsideRange(robot.getLocation().getCoordinate())){
			throw new InvalidInputException("Invalid robot place");
		}
	}	
	
	
	/**
	 * check whether the given coordinate is within the range
	 * @param coordinate the coordinate to be checked
	 * @return true if it is not 
	 */
	public boolean isInsideRange(Coordinate coordinate){
		
		//end points are included so the move is valid if coordinates are less than edge
		if(coordinate.getX() >=0 && coordinate.getX()<upperRightCoordinates.getX() &&
			coordinate.getY() >=0 && coordinate.getY() <upperRightCoordinates.getY()){
			return true;
		}
		return false;
		
	}

	public Coordinate getUpperRightCoordinates() {
		return upperRightCoordinates;
	}

	public void setUpperRightCoordinates(Coordinate upperRightCoordinates) {
		this.upperRightCoordinates = upperRightCoordinates;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	
	/**
	 * handle the movement of robot on plateau
	 * @param movements
	 * @return
	 */
	public Robot moveRobot(List<Displacement> movements){
		for (Displacement displacement : movements) {
			switch (displacement) {
			case MOVE:
				if(isInsideRange(robot.getLocation().getCoordinate())){
					robot.move();
				}
				break;
			case LEFT:
				robot.changeDirectionToLeft();
				break;
			case RIGHT:
				robot.changeDirectionToRight();
				break;

			}
		}
		return robot;
	}

}
