package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import negocio.Parcial;

public class ParcialTest {

    private final Parcial parcial = new Parcial();

    @Test
    public void potenciaConExponenteCeroRetornaUno() throws Exception {
        assertEquals(1, parcial.potencia(5, 0));
    }

    @Test
    public void potenciaConBasePositivaRetornaResultadoCorrecto() throws Exception {
        assertEquals(243, parcial.potencia(3, 5));
    }

    @Test
    public void potenciaConBaseNegativaYExponenteImparRetornaResultadoNegativo() throws Exception {
        assertEquals(-32, parcial.potencia(-2, 5));
    }

    @Test
    public void potenciaConExponenteNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> parcial.potencia(2, -1));
    }

    @Test
    public void potenciaMayorQueEnteroMaximoLanzaExcepcion() {
        assertThrows(ArithmeticException.class, () -> parcial.potencia(2, 31));
    }

    @Test
    public void potenciaMenorQueEnteroMinimoLanzaExcepcion() {
        assertThrows(ArithmeticException.class, () -> parcial.potencia(-129, 5));
    }
}
