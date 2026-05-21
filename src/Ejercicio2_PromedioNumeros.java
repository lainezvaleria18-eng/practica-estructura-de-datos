import java.util.Scanner;

public class Ejercicio2_PromedioNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        System.out.println(" PROMEDIO DE 12 NUMEROS ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero [" + i + "]: ");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("\nPromedio = " + promedio);
    }
}