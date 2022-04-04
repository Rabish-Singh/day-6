import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ForLoopDemo_ {

	public static void main(String[] args) throws IOException {
		String file="output.txt";
		FileWriter writer = new FileWriter(file);
		BufferedWriter bufferedWriter= new BufferedWriter(writer);
		String data ="";
		for(int row=5;row>=1;row--) {
			for(int column=0;column<row;column++) {
				data +="*";
			}
			data +="\n";
		}
		bufferedWriter.write(data);
		bufferedWriter.close();

	}

}
