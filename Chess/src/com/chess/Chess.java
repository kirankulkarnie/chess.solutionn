package com.chess;

public class Chess implements ChessMoveable {

	@Override
	public String getResult(int ch, int index, boolean forward, boolean backward, boolean daigonal, boolean horizontal,
			boolean vertical, int positionMoved, boolean repeat) {
		
		String output="";
		if(forward==true && vertical==true && index+positionMoved<=8)
			output=output+((char) ch)+""+(index+positionMoved)+",";
		if(daigonal==true && forward==true && ch+positionMoved<=72 && index+positionMoved<=8)
			output=" "+output+((char) (ch+positionMoved))+""+(index+positionMoved)+",";
		if(horizontal==true && ch+positionMoved<=72)
			output=" "+output+((char) (ch+positionMoved))+""+(index)+",";
		if(daigonal==true && backward==true && ch+positionMoved<=72 && index-positionMoved>=1)
			output=" "+output+((char) (ch+positionMoved))+""+(index-positionMoved)+",";
		if(backward==true && vertical==true && index-positionMoved>=1)
			output=" "+output+((char) ch)+""+(index-positionMoved)+",";
		if(daigonal==true && backward==true && ch-positionMoved>=65 && index-positionMoved>=1)
			output=" "+output+((char) (ch-positionMoved))+""+(index-positionMoved)+",";
		if(horizontal==true && ch-positionMoved>=65)
			output=" "+output+((char) (ch-positionMoved))+""+(index)+",";
		if(daigonal==true && forward==true && ch-positionMoved>=65 && index+positionMoved<=8)
			output=" "+output+((char) (ch-positionMoved))+""+(index+positionMoved)+",";
		output=output.trim();
		return output;
	}
}
