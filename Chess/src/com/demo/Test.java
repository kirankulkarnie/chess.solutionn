package com.demo;

import java.util.Scanner;

import com.chess.Chess;
import com.chess.ChessMoveable;

public class Test {
	
	public static void main(String[] args) {
		ChessMoveable cm = new Chess();
		System.out.println("Please enter input: ");
		Scanner scan = new Scanner(System.in);
	    String inputData = scan.nextLine();
	    while(inputData.equals("")){
	    	System.out.println("Input String cannot be empty, Please enter valid data: ");
	    	inputData = scan.nextLine();
	    }
	    String output = "", output01="";
		String[] s = inputData.split(" ");
		String input = s[1].toUpperCase();
		int ch = input.charAt(0);
		int index = Integer.parseInt(""+input.charAt(1));
		int counter = 1;
		if(ch>= 65 && ch <=72 && index >0 && index <8) {	
		switch(s[0].toLowerCase()) {
			case "king" :
			output = cm.getResult(ch,index,true,true,true,true,true,1,false);
			break;
			case "bishop" :
				do {
				output01= cm.getResult(ch,index,true,true,true,false,false,counter,false);
				counter++;
				output=output+output01;
				}while(output01!="");
				break;
			case "rook" :
				do {
					output01= cm.getResult(ch,index,true,true,false,true,true,counter,false);
					counter++;
					output=output+output01;
				}while(output01!="");
				break;
			case "pawn" :
					output= cm.getResult(ch,index,true,false,false,false,true,1,false);
				break;
			case "queen" :
				do {
					output01= cm.getResult(ch,index,true,true,true,true,true,counter,false);
					counter++;
					output=output+output01;
				}while(output01!="");
				break;
			case "horse" :
					output=output+ cm.getResult(ch,index+2,false,false,false,true,false,counter,false);
					output=output+ cm.getResult(ch,index-2,false,false,false,true,false,counter,false);
					output=output+ cm.getResult(ch+2,index,true,true,false,false,true,counter,false);
					output=output+ cm.getResult(ch-2,index,true,true,false,false,true,counter,false);
				break;
			default :
				System.out.println("Please, enter valid input! ");
			}
			System.out.println(output.substring(0,output.length()-1));
		}else {
			System.out.println("invalid input");
		}
	}
}
