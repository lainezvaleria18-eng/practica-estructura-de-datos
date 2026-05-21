import java.util.Scanner;

public class Ejercicio3_ParesImpares {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[12];

        int pares = 0;
        int impares = 0;

        System.out.println("CONTADOR DE PARES E IMPARES");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese numero [" + i + "]: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nCantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}