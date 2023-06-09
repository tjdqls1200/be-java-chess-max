package chess.board;

import chess.piece.Pawn;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private final List<Pawn> pawns = new ArrayList<>();

    public void addPawn(final Pawn pawn) {
        pawns.add(pawn);
    }

    public Pawn findPawn(final int index) {
        return pawns.get(index);
    }
}
