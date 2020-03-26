
public class InvalidComparisonException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message1, message2;
	public InvalidComparisonException(String class1, String class2) {
		message1 = class1;
		message2 = class2;
	}
	@Override
	public String toString() {
		return ("Can't Compare class " + message1 + " with " + message2);
	}
}
