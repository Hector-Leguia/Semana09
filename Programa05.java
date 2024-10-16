package Programas;
import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar los arreglos a y b de tamaño 5
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10]; // Arreglo c para almacenar los valores intercalados

        // Ingresar los valores del arreglo a
        System.out.println("Ingrese 5 valores para el arreglo a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        // Ingresar los valores del arreglo b
        System.out.println("\nIngrese 5 valores para el arreglo b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        // Intercalar los valores de a y b en el arreglo c
        for (int i = 0; i < a.length; i++) {
            c[i * 2] = a[i];     // Asigna los valores de a en las posiciones pares de c
            c[i * 2 + 1] = b[i]; // Asigna los valores de b en las posiciones impares de c
        }

        // Mostrar los valores del arreglo c intercalados
        System.out.println("\nValores intercalados en el arreglo c:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}