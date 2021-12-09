
@SuppressWarnings("serial")
public class InvalidCoordinateException extends RuntimeException {

	public InvalidCoordinateException(String message) {
		super(message);
		System.out.println("This coordinate is less than 0. Please try again.");
	}
}
