package com.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        int numero = scanner.nextInt();
        double iva = numero * 0.19;
        double suma = numero + iva;

        System.out.println("El precio con IVA es: " + suma);
    }
}
