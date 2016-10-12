package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author B1579
 *
 */
public class Main1 {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		for (int i=line.length()-1; i>=0; i--){
				System.out.print(line.charAt(i));
		}
		System.out.println("");
	}
}
