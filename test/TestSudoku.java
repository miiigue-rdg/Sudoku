import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSudoku {

    @Test
    public void testComprobarCasillaJugar() {
        TableroSudokuJugar tablero = new TableroSudokuJugar();
        tablero.tableroSudokuBase[0][0] = 5;
        tablero.introducirNumeroJugar(0, 0);
        assertTrue(tablero.comprobarCasillaJugar(5, 0, 0));
        assertFalse(tablero.comprobarCasillaJugar(3, 0, 0));
    }
}

