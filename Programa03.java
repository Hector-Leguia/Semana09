package Programas;
import java.util.Scanner;
public class Programa03 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        // Declarar un arreglo para almacenar las compras
        double[] compras = new double[n];
        // Variables para calcular la suma de compras, y encontrar la mayor y menor compra
        double sumaCompras = 0;
        double compraMayor = Double.MIN_VALUE;
        double compraMenor = Double.MAX_VALUE;
        // Registrar las compras de las personas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            sumaCompras += compras[i];
            // Actualizar la compra mayor si el valor actual es más alto
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            // Actualizar la compra menor si el valor actual es más bajo
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        // Calcular el promedio de compras
        double promedioCompras = sumaCompras / n;

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("El total de las compras es: " + sumaCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }
}