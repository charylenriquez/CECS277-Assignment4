
public class InvalidComparisonException extends RuntimeException {
	public InvalidComparisonException() {
		//super();
	}
	public InvalidComparisonException(String message1, String message2) {
		//super();
		System.out.print("Can't Compare class " + message1 + " with " + message2);
	}
}
