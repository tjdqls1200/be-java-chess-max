package chess.piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.*;

public class PawnTest {
    @DisplayName("Color에 맞는 Pawn이 생성되어야 한다.")
    @EnumSource(value = Color.class)
    @ParameterizedTest
    void createPawn(final Color color) {
        final Pawn pawn = new Pawn(color);

        assertThat(pawn.getColor()).isEqualTo(color);
    }
}
