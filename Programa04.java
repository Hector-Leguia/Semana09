package Programas;
import java.util.Scanner;
public class Programa04 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar un arreglo para almacenar los nombres de las personas
        String[] nombres = new String[5];

        // Solicitar al usuario que ingrese los nombres
        System.out.println("Ingrese los nombres de 5 personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Solicitar al usuario que ingrese el nombre a buscar
        System.out.print("\nIngrese el nombre que desea buscar: ");
        String nombreBuscado = scanner.nextLine();

        // Buscar el nombre en el arreglo
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("La persona '" + nombreBuscado + "' existe en la posicion " + (posicion + 1) + ".");
        } else {
            System.out.println("La persona '" + nombreBuscado + "' no existe en el arreglo.");
        }
    }
}