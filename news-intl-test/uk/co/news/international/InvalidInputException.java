package uk.co.news.international;

/**
 * This exception would be raised when system receives any invalid input
 * @author Arsalan
 *
 */
public class InvalidInputException extends RuntimeException {
	
	public InvalidInputException(String reason) {
		super(reason);
	}

}
