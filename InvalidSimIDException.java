
@SuppressWarnings("serial")
public class InvalidSimIDException extends RuntimeException {

	public InvalidSimIDException(String message) {
		
		super(message);
		System.out.println("This ID is invalid. Please try again.");
	}
}
