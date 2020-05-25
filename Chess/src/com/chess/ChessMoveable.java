package com.chess;

public interface ChessMoveable {
	public String getResult(int ch, int index, boolean forward, boolean backward, boolean daigonal, boolean horizontal,boolean vertical, int positionMoved,boolean repeat);
}
