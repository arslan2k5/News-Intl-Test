package uk.co.news.international.test;

import uk.co.news.international.IService;
import uk.co.news.international.InvalidInputException;
import uk.co.news.international.Service;
import junit.framework.TestCase;

public class RobotTest extends TestCase {
	
	private final static String LINE_SEPARATOR;
	
	static {
		LINE_SEPARATOR = System.getProperty("line.separator");
	}
	
	public void testLeft(){
		String input="5 5"+LINE_SEPARATOR+"1 2 N"+LINE_SEPARATOR+"LMLMLMLMM";
		IService service = new Service();
		String output = service.run(input);
		System.out.println(output);
		assertEquals("1 3 N", output);
	}
	
	public void testRight(){
		String input="5 5"+LINE_SEPARATOR+"1 2 N"+LINE_SEPARATOR+"RM";
		IService service = new Service();
		String output = service.run(input);
		System.out.println(output);
		assertEquals("2 2 E", output);
	}
	
	public void testInvalidMoveString(){
		String input="5 5"+LINE_SEPARATOR+"1 2 N"+LINE_SEPARATOR+"RMI";
		IService service = new Service();
		String output="";
		try{
			service.run(input);
		}catch (InvalidInputException e) {
			System.out.println(e.getLocalizedMessage());
			output = e.getLocalizedMessage();
		}
		assertEquals("invalid movement string", output);
	}
	
	public void testInvalidRobotCoordinateString(){
		String input="5 5"+LINE_SEPARATOR+"1 9 N"+LINE_SEPARATOR+"RM";
		IService service = new Service();
		String output="";
		try{
			
			service.run(input);
		}catch (InvalidInputException e) {
			System.out.println(e.getLocalizedMessage());
			output = e.getLocalizedMessage();
		}
		assertEquals("Invalid robot place", output);
	}

	public void testInvalidRobotDirectionString(){
		String input="5 5"+LINE_SEPARATOR+"1 9 U"+LINE_SEPARATOR+"RM";
		IService service = new Service();
		boolean isException = false;
		String output="";
		try{
			service.run(input);
		}catch (InvalidInputException e) {
			isException = true;
			output = e.getLocalizedMessage();
			System.out.println(e.getLocalizedMessage());
		}
		assertEquals("Invailid direction", output);
	}
	
	public void testWithoutRobotDirectionString(){
		String input="5 5"+LINE_SEPARATOR+"1 9"+LINE_SEPARATOR+"RM";
		IService service = new Service();
		String output="";
		try{
			service.run(input);
		}catch (InvalidInputException e) {
			output = e.getLocalizedMessage();
			System.out.println(e.getLocalizedMessage());
		}
		assertEquals("cannot parse robot position string", output);
	}

	
	public void testInvalidRobotPositionLengthString(){
		String input="5 5"+LINE_SEPARATOR+"1 2 NA"+LINE_SEPARATOR+"RMI";
		IService service = new Service();
		String output="";
		try{
			
			service.run(input);
		}catch (InvalidInputException e) {
			output = e.getLocalizedMessage();
			System.out.println(e.getLocalizedMessage());
		}
		assertEquals("Invalid direction", output);
	}
}
