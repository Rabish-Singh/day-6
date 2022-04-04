import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ForLoopDemo extends Utility{
	/**
	 * printRowOfSize TAKING AN INPUT And Printing "row" Number Of Rows and inside
	 * every items we are printing it by "row" times and every time the "row" is
	 * getting Decremented.
	 * 
	 * @param row
	 */
	
	
	static void printRowOfSize(int row) {
		Utility.ValidateInput(row);
		for (; row >= 1; row--) {

			for (int column = 0; column < row; column++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}

	private static void usingWhileLoop(int row) {
		Utility.ValidateInput(row);
		while (row >= 1) {
			String starPattern = "";
			int columns = 0;
			while (columns < row) {
				starPattern += "*";
				columns++;
			}
			row--;
			starPattern = "\n";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		char ch=new char.Next();
//		printRowOfSize(5);
		usingWhileLoop(5);
	}

}
