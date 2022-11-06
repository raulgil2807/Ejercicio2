package com.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        double resultado = calcularIVA(100);
        System.out.println("El precio del producto con el IVA incluido " + resultado);
        }

    static double calcularIVA(double precio) {
        final double iva= 0.19;
        double resultado = 0;
        resultado = iva * resultado;
        return resultado;
    }
}
