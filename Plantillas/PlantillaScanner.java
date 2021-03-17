import java.io.BufferedInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PlantillaScanner {

	private static Scanner in = new Scanner(new BufferedInputStream(System.in, 4096));
	private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) {

		//

		out.flush();
		out.close();
		in.close();

	}

}
