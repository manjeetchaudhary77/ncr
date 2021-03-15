package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    
    public static int MIN_BOARD_WIDTH = 0;
    public static int MIN_BOARD_HEIGHT = 0;
    public static Pawn pTest;
    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
    	Pawn p=pieces[xCoordinate][yCoordinate];
    	if(p!=null) {
    		if(p.getXCoordinate()==xCoordinate) {
        		if(p.getYCoordinate()==yCoordinate) {
        			if(p.getPieceColor()==pieceColor) {
        				pawn.setXCoordinate(-1);
        				pawn.setYCoordinate(-1);
        			}
        		}
        	}
    	}
    	
    	else {
			pawn.setXCoordinate(xCoordinate);
			pawn.setYCoordinate(yCoordinate);
			
		}
    	pTest=pawn;
    	pieces[xCoordinate][yCoordinate]=pawn;
       // throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate>=MIN_BOARD_WIDTH && xCoordinate<MAX_BOARD_WIDTH) {
        	if(yCoordinate>=MIN_BOARD_HEIGHT && yCoordinate<MAX_BOARD_HEIGHT)
        		return true;
        }
        return false;
    	//throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
}
