
@SuppressWarnings("serial")
public class InvalidWingspanException extends RuntimeException {

	public InvalidWingspanException(String message) {
		
		super(message);
		System.out.println("This wingspan is outside of range.");
	}
}
