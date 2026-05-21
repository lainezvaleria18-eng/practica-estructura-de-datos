import java.util.Scanner;

public class Ejercicio1_ListaFrutas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] frutas = new String[10];

        System.out.println(" REGISTRO DE FRUTAS ");

        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese la fruta [" + i + "]: ");
            frutas[i] = entrada.nextLine();
        }

        System.out.println("\n FRUTAS EN ORDEN INVERSO ");

        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }
}