package chess.board;

import chess.piece.Color;
import chess.piece.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ChessBoardTest {
    @DisplayName("Board에 흰색, 검은색 Pawn이 저장된다.")
    @Test
    public void addPawnBoardTest() {
        //given
        final ChessBoard chessBoard = new ChessBoard();
        final Pawn whitePawn = new Pawn(Color.WHITE);
        final Pawn blackPawn = new Pawn(Color.BLACK);

        //when
        chessBoard.addPawn(whitePawn);
        chessBoard.addPawn(blackPawn);

        //then
        assertThat(chessBoard.findPawn(0)).isEqualTo(whitePawn);
        assertThat(chessBoard.findPawn(1)).isEqualTo(blackPawn);
    }
}
