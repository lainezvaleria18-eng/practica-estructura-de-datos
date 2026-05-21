import java.util.Scanner;

public class Ejercicio6_Transpuesta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("=== MATRIZ ORIGINAL ===");


        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {

                System.out.print("Numero [" + f + "][" + c + "]: ");
                matriz[f][c] = entrada.nextInt();
            }
        }

        System.out.println("\n=== MATRIZ TRANSPUESTA ===");


        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {

                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }
    }
}