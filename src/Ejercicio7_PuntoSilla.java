import java.util.Scanner;

public class Ejercicio7_PuntoSilla {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("=== BUSQUEDA DE PUNTO DE SILLA ===");

        // Llenar matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {

                System.out.print("Numero [" + f + "][" + c + "]: ");
                matriz[f][c] = entrada.nextInt();
            }
        }

        boolean encontrado = false;

        // Buscar punto de silla
        for (int f = 0; f < 3; f++) {

            int menor = matriz[f][0];
            int columnaMenor = 0;

            // Buscar el menor de la fila
            for (int c = 1; c < 4; c++) {

                if (matriz[f][c] < menor) {
                    menor = matriz[f][c];
                    columnaMenor = c;
                }
            }

            boolean puntoSilla = true;

            // Verificar si es mayor en su columna
            for (int fila = 0; fila < 3; fila++) {

                if (matriz[fila][columnaMenor] > menor) {
                    puntoSilla = false;
                    break;
                }
            }

            if (puntoSilla) {

                System.out.println("\nPunto de silla encontrado: " + menor);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("\nNo existe punto de silla.");
        }
    }
}