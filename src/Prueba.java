package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Prueba{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int numberCases = 0;
		try {
			//number of cases
			line = input.readLine();
			numberCases = Integer.parseInt(line);
		}catch(IOException e) {
			
		}
	}
}
