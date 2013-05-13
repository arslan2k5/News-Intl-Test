package uk.co.news.international;


public class Service implements IService {
	
	/* run the application
	 * @see uk.co.news.international.IService#run(java.lang.String)
	 */
	public String run(String inputStr){
		Input input = InputParser.parse(inputStr);
		String output;
		Robot robot = new Robot(input.getRobotPosition());
		Plateau plateau = new Plateau(input.getPlateauCoordinates(), robot);
		robot = plateau.moveRobot(input.getRobotMovement());
		output = robot.getLocation().toString();
		return output;
	}
	

}
