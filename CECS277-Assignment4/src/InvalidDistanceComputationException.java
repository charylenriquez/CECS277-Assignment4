
public class InvalidDistanceComputationException extends RuntimeException {
	public InvalidDistanceComputationException() {
		super();
	}
	public InvalidDistanceComputationException(String message1, String message2) {
		//super();
		System.out.println("can't Compute Distance Between class " + message1 + " and " + message2 );
	}
}
