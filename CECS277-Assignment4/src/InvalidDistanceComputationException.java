
public class InvalidDistanceComputationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message1, message2;
	public InvalidDistanceComputationException(String class1, String class2) {
		message1 = class1;
		message2 = class2;
	}
	@Override
	public String toString() {
		return "can't Compute Distance Between class " + message1 + " and " + message2;
	}
}
