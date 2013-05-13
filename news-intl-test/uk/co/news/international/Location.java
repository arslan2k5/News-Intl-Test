package uk.co.news.international;

/**
 * This class hold the position of the robot on plateau
 * @author Arsalan
 *
 */
public class Location {

	private Coordinate coordinate;
	private Direction direction;
	
	public Location(Coordinate coordinate, Direction direction) {
		this.coordinate = coordinate;
		this.direction = direction;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("");
		str.append(coordinate.getX()).append(" ").append(coordinate.getY()).append(" ").append(direction.getDirection());
		return str.toString();
	}
}
