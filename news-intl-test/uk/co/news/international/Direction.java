package uk.co.news.international;

/**
 * enum for directions
 * @author Arsalan
 *
 */
public enum Direction {
	EAST("E"),
	WEST("W"),
	NORTH("N"),
	SOUTH("S");
	
	private Direction(String direction) {
		this.direction = direction;
	}

	private String direction;

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
}
