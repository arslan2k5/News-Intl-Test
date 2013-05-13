package uk.co.news.international;

import java.util.List;

/**
 * This class will hold all the information parsed by parser
 * @author Arsalan
 *
 */
public class Input {
	
	private Coordinate plateauCoordinates;
	private Location robotPosition;
	private List<Displacement> robotMovement;
	
	public Coordinate getPlateauCoordinates() {
		return plateauCoordinates;
	}
	public void setPlateauCoordinates(Coordinate plateauCoordinates) {
		this.plateauCoordinates = plateauCoordinates;
	}
	public Location getRobotPosition() {
		return robotPosition;
	}
	public void setRobotPosition(Location robotPosition) {
		this.robotPosition = robotPosition;
	}
	public List<Displacement> getRobotMovement() {
		return robotMovement;
	}
	public void setRobotMovement(List<Displacement> robotMovement) {
		this.robotMovement = robotMovement;
	}
}
