import java.util.Scanner;

public class Ejercicio5_ArticulosInversos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        System.out.println("=== REGISTRO DE ARTICULOS ===");


        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {

                System.out.print("Articulo [" + f + "][" + c + "]: ");
                articulos[f][c] = entrada.nextLine();
            }
        }

        System.out.println("\n=== MATRIZ CON FILAS INVERTIDAS ===");


        for (int f = 2; f >= 0; f--) {
            for (int c = 0; c < 3; c++) {

                System.out.print(articulos[f][c] + "\t");
            }
            System.out.println();
        }
    }
}