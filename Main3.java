package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		char[] input = line.toCharArray();

		int b =0;
		int g =0;
		int r =0;
		for (char color:input){
			if(color=='B'){
				b++;
			} else if (color=='G'){
				g++;
			} else if (color=='R'){
				r++;
			}
		}

		int num =0;
		num += b % 2;
		num += g % 2;
		num += r % 2;

		System.out.println(num);
	}
}
