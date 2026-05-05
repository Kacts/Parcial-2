package negocio;

public class Parcial {

    public int potencia(int b, int e) throws Exception {
        if (e < 0) {
            throw new IllegalArgumentException("El exponente debe ser mayor o igual a cero.");
        }

        long resultado = 1;

        for (int i = 0; i < e; i++) {
            try {
                resultado = Math.multiplyExact(resultado, b);
            } catch (ArithmeticException exception) {
                throw new ArithmeticException("El resultado de la potencia no cabe en el entero.");
            }

            if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
                throw new ArithmeticException("El resultado de la potencia no cabe en el entero.");
            }
        }

        return (int) resultado;
    }
}
