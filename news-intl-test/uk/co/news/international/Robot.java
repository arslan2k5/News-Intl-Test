package uk.co.news.international;

/**
 * This class represent the robot, 
 * track and manipulate its location
 * @author Arsalan
 *
 */
public class Robot {
	private Location location;
	
	public Robot(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * move the robot by one step based on its current direction
	 */
	public void move() {
		switch (location.getDirection()) {
		case EAST:
			location.getCoordinate().increaseX();
			break;
		case WEST:
			location.getCoordinate().decreaseX();
			break;
		case NORTH:
			location.getCoordinate().increaseY();
			break;
		case SOUTH:
			location.getCoordinate().decreaseY();
			break;

		}
	}

	/**
	 * change direction to 90 degree towards right 
	 */
	public void changeDirectionToRight() {
		switch (location.getDirection()) {
		case EAST:
			location.setDirection(Direction.SOUTH);
			break;
		case WEST:
			location.setDirection(Direction.NORTH);
			break;
		case NORTH:
			location.setDirection(Direction.EAST);
			break;
		case SOUTH:
			location.setDirection(Direction.WEST);
			break;

		}
	}

	/**
	 * change direction to 90 degree towards left
	 */
	public void changeDirectionToLeft() {
		switch (location.getDirection()) {
		case EAST:
			location.setDirection(Direction.NORTH);
			break;
		case WEST:
			location.setDirection(Direction.SOUTH);
			break;
		case NORTH:
			location.setDirection(Direction.WEST);
			break;
		case SOUTH:
			location.setDirection(Direction.EAST);
			break;
		}
	}

}
