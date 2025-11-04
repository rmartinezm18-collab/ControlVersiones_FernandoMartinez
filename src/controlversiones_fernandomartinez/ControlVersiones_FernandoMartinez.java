package controlversiones_fernandomartinez;

import java.util.Scanner;

public class ControlVersiones_FernandoMartinez {

    // Función para calcular promedio
    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double n : numeros) {
            suma += n;
        }
        return suma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calculadora de Promedio - Versión 2 ===");

        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Cantidad inválida. El programa termina.");
            return;
        }

        double[] numeros = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);
    }
}
