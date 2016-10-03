package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] cards = line.split(" ");

		ArrayList <Integer> sList = new ArrayList<Integer>();
		ArrayList <Integer> dList = new ArrayList<Integer>();
		ArrayList <Integer> cList = new ArrayList<Integer>();
		ArrayList <Integer> hList = new ArrayList<Integer>();

		for (int cnt=0; cnt<cards.length; cnt++){
			String[] card = cards[cnt].split("");

			if(card[0].equals("S")){
				sList.add(numChange(card[1]));
			} else if(card[0].equals("D")){
				dList.add(numChange(card[1]));
			} else if(card[0].equals("C")){
				cList.add(numChange(card[1]));
			} else if(card[0].equals("H")){
				hList.add(numChange(card[1]));
			}

		}

		Collections.sort(dList);
		Collections.sort(cList);
		Collections.sort(hList);
		String sep =",";

		if(!sList.isEmpty()){
			Collections.sort(sList);
			StringBuilder sb = new StringBuilder();
			for (int number:sList){
				sb.append(numReturn(number)).append(sep);
			}
			String result = sb.substring(0, sb.length()-1);
			System.out.print("S:");
			System.out.println(result);
		}
		if(!dList.isEmpty()){
			Collections.sort(dList);
			StringBuilder sb = new StringBuilder();
			for (int number:dList){
				sb.append(numReturn(number)).append(sep);
			}
			String result = sb.substring(0, sb.length()-1);
			System.out.print("D:");
			System.out.println(result);
		}
		if(!cList.isEmpty()){
			Collections.sort(cList);
			StringBuilder sb = new StringBuilder();
			for (int number:cList){
				sb.append(numReturn(number)).append(sep);
			}
			String result = sb.substring(0, sb.length()-1);
			System.out.print("C:");
			System.out.println(result);
		}
		if(!hList.isEmpty()){
			Collections.sort(hList);
			StringBuilder sb = new StringBuilder();
			for (int number:hList){
				sb.append(numReturn(number)).append(sep);
			}
			String result = sb.substring(0, sb.length()-1);
			System.out.print("H:");
			System.out.println(result);
		}
	}
	public static String numReturn(int num){
		String symbol = null;
		if(num == 11){
			symbol="J";
		} else if (num == 12){
			symbol="Q";
		} else if (num == 13){
			symbol="K";
		} else if (num == 10){
			symbol="0";
		} else if (num == 1){
			symbol="A";
		} else {
			symbol= String.valueOf(num);
		}
		return symbol;
	}

	public static int numChange(String symbol){
		int num = 0;
		if(symbol.equals("J")){
			num = 11;
		} else if (symbol.equals("Q")){
			num = 12;
		} else if (symbol.equals("K")){
			num = 13;
		} else if (symbol.equals("0")){
			num = 10;
		} else if (symbol.equals("A")){
			num = 1;
		} else{
			num = Integer.parseInt(symbol);
		}
		return num;
	}
}
