package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] input = line.split("");

		int num =0;

		int b =0;
		int g =0;
		int r =0;
		for (String color:input){
			if(color.equals("B")){
				b++;
			} else if (color.equals("G")){
				g++;
			} else if (color.equals("R")){
				r++;
			}
		}
		if(b%2==1){
			num++;
		}
		if(g%2==1){
			num++;
		}
		if(r%2==1){
			num++;
		}
		System.out.println(num);
	}
}
