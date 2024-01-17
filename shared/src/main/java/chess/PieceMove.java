package chess;

import java.util.Collection;
import java.util.ArrayList;

public class PieceMove {
  private ChessPosition position;
  private ChessPiece.PieceType pieceType;

  public PieceMove(ChessPosition position, ChessPiece.PieceType pieceType){
    this.position = position;
    this.pieceType = pieceType;
  }

  public ArrayList<ChessMove> BishopMoveCalculator(ChessPosition position){

  }

}
