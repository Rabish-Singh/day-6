
public class Utility {
	public static void ValidateInput(int row) {
		if ( row <= 0) {
			throw new IllegalArgumentException("row value should be greater than zero");
		}
	}
}
