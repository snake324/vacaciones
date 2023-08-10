package dev.cristian.ex1;

import java.util.Scanner;

public class ex1 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el número de un mes (1-12): ");
    int numeroMes = scanner.nextInt();

    String nombreMes = obtenerNombreMes(numeroMes);
    int cantidadDias = obtenerCantidadDias(numeroMes);

    System.out.println("El mes es: " + nombreMes);
    System.out.println("Tiene " + cantidadDias + " días.");

    scanner.close();
}

public static String obtenerNombreMes(int numeroMes) {
    String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril",
        "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    if (numeroMes >= 1 && numeroMes <= 12) {
        return meses[numeroMes - 1];
    } else {
        return "Mes inválido";
    }
}

public static int obtenerCantidadDias(int numeroMes) {
    int[] diasPorMes = {
        31, 28, 31, 30,
        31, 30, 31, 31,
        30, 31, 30, 31
    };

    if (numeroMes >= 1 && numeroMes <= 12) {
        return diasPorMes[numeroMes - 1];
    } else {
        return -1; // Valor indicando mes inválido
    }
}
}
