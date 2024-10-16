package Programas;

import java.util.Scanner;

public class Programa01 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();

        // Declarar un arreglo para almacenar los pesos
        double[] pesos = new double[n];

        // Registrar los pesos de las personas
        double sumaPesos = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            sumaPesos += pesos[i];
        }

        // Calcular el peso promedio
        double pesoPromedio = sumaPesos / n;

        // Mostrar el resultado
        System.out.println("El peso promedio de las " + n + " personas es: " + pesoPromedio + " kg");
    }
}
