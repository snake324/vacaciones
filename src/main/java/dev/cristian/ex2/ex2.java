package dev.cristian.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un año: ");
    int año = scanner.nextInt();

    boolean esBisiesto = esAñoBisiesto(año);
    
    if (esBisiesto) {
    System.out.println(año + " és un año bisiesto.");
    } else {
    System.out.println(año + " no és un año bisiesto.");
    }
    scanner.close();
    }


    public static boolean esAñoBisiesto(int año){
        if ((año % 4 == 0 && año % 100 !=0) || (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}