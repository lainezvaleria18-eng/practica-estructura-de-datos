import java.util.Scanner;

public class Ejercicio4_MayorMenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println(" MAYOR Y MENOR DE 10 NUMEROS ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero [" + i + "]: ");
            numeros[i] = entrada.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\nMayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}