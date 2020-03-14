
public class InvalidComparisonException extends RuntimeException {
	String message1, message2;
	public InvalidComparisonException(String class1, String class2) {
		message1 = class1;
		message2 = class2;
	}
	public String toString() {
		return ("Can't Compare class " + message1 + " with " + message2);
	}
}
