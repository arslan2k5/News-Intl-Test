package uk.co.news.international;

import java.util.ArrayList;
import java.util.List;

/**
 * this is the utility class to parse the input string
 * @author Arsalan
 *
 */
public class InputParser {
	
	/**
	 * parse the given string
	 * @param inputStr the input string
	 * @return return the parsed string
	 */
	public static Input parse(String inputStr){
		Input input = new Input();
		String[] splittedInput = inputStr.split(System.getProperty("line.separator"));
		input.setPlateauCoordinates(parsePlateauSize(splittedInput[0]));
		input.setRobotPosition(parseRobotPosition(splittedInput[1]));
		input.setRobotMovement(parseMovement(splittedInput[2]));
		
		return input;
	}
	
	/**
	 * parse Plateau size
	 * @param size the size string
	 * @return the parsed coordinate object
	 */
	private static Coordinate parsePlateauSize(String size){
		Coordinate coordinate = new Coordinate();

		String[] splittedSize = size.split(" ");
		
		if(splittedSize.length != 2){
			throw new InvalidInputException("cannot parse plateau size ");
		}
		
		coordinate.setX(Integer.parseInt(splittedSize[0]));
		coordinate.setY(Integer.parseInt(splittedSize[1]));
		return coordinate;
	}

	/**
	 * parse Robot position size
	 * @param size the size string
	 * @return the parsed coordinate object
	 */
	private static Location parseRobotPosition(String size){
		Location location;
		Coordinate coordinate = new Coordinate();

		String[] splittedSize = size.split(" ");
		
		if(splittedSize.length != 3){
			throw new InvalidInputException("cannot parse robot position string");
		}
		
		coordinate.setX(Integer.parseInt(splittedSize[0]));
		coordinate.setY(Integer.parseInt(splittedSize[1]));
		return new Location(coordinate, getDirection(splittedSize[2]));
	}
	
	/**
	 * parse string and identify the movements of Robot
	 * @param inputString the dispalcement string
	 * @return the list of movements 
	 */
	private static List<Displacement> parseMovement(String inputString){
		List<Displacement> movements = new ArrayList<Displacement>();
		for(int i=0;i<inputString.length();i++){
			movements.add(getMovement(inputString.charAt(i)));
		}
		return movements;
	}
	
	private static Direction getDirection(String directionChar){
		if(directionChar.length() > 1){
			throw new InvalidInputException("Invalid direction");
		}
		Direction direction;
		switch (directionChar.charAt(0)) {
		case 'E':
			direction = Direction.EAST;
			break;
		case 'W':
			direction = Direction.WEST;		
			break;
		case 'N':
			direction = Direction.NORTH;
			break;
		case 'S':
			direction = Direction.SOUTH;
			break;

		default:
			throw new InvalidInputException("Invailid direction");
		}
		return direction;
	}
	
	private static Displacement getMovement(char moveStr){
		Displacement move;
		switch (moveStr) {
		
		case 'M':
			move = Displacement.MOVE;
			break;
		case 'L':
			move = Displacement.LEFT;
			break;
		case 'R':
			move = Displacement.RIGHT;
			break;

		default:
			throw new InvalidInputException("invalid movement string");
		}
		
		return move;
	}

}
