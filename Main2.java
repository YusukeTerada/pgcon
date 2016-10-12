package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	static final String SEP = ",";
	static final String TRUMP_NUM = "A234567890JQK";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] cards = line.split(" ");

		ArrayList <Integer> sList = new ArrayList<Integer>();
		ArrayList <Integer> dList = new ArrayList<Integer>();
		ArrayList <Integer> cList = new ArrayList<Integer>();
		ArrayList <Integer> hList = new ArrayList<Integer>();

		for (String str : cards){
			char[] card = str.toCharArray();
			if(card[0]=='S'){
				sList.add(convertStrToNum(card[1]));
			} else if(card[0]=='D'){
				dList.add(convertStrToNum(card[1]));
			} else if(card[0]=='C'){
				cList.add(convertStrToNum(card[1]));
			} else if(card[0]=='H'){
				hList.add(convertStrToNum(card[1]));
			}
		}

		if(!sList.isEmpty()){
			output("S:",sList);
		}
		if(!dList.isEmpty()){
			output("D:",dList);
		}
		if(!cList.isEmpty()){
			output("C:",cList);
		}
		if(!hList.isEmpty()){
			output("H:",hList);
		}
	}
	public static char convertNumToStr(int num){
		return TRUMP_NUM.charAt(num-1);
	}

	public static int convertStrToNum(char symbol){
		return TRUMP_NUM.indexOf(symbol)+1;
	}

	static void output(String type, ArrayList<Integer> list){
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		sb.append(type);
		for (int number:list){
			sb.append(convertNumToStr(number)).append(SEP);
		}
		String result = sb.substring(0, sb.length()-1);
		System.out.println(result);
	}
}
