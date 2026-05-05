package presentacion;

import java.util.Scanner;

import negocio.Parcial;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parcial parcial = new Parcial();

        try {
            System.out.print("Ingrese la base: ");
            int base = scanner.nextInt();

            System.out.print("Ingrese su exponente: ");
            int exponente = scanner.nextInt();

            int resultado = parcial.potencia(base, exponente);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("No fue posible calcular la potencia: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
