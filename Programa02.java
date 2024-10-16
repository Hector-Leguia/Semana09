package Programas;
import java.util.Scanner;
public class Programa02 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();

        // Declarar un arreglo para almacenar los ingresos
        double[] ingresos = new double[n];

        // Variables para calcular la suma de ingresos y encontrar el mayor ingreso
        double sumaIngresos = 0;
        double ingresoMayor = 0;

        // Registrar los ingresos de las personas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            sumaIngresos += ingresos[i];

            // Actualizar el ingreso mayor si el actual es más alto
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }

        // Calcular el ingreso promedio
        double ingresoPromedio = sumaIngresos / n;

        // Mostrar el resultado
        System.out.println("El ingreso promedio de las " + n + " personas es: " + ingresoPromedio);
        System.out.println("El ingreso mayor es: " + ingresoMayor);
    }
}