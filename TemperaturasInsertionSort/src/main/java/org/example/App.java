package org.example;

public class App {
    public static void main(String[] args) {

        int[] arr = { 18, 23, 29, 15, 21, 30, 17 };

        int[] original = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            original[i] = arr[i];
        }

        InsertionSort sortin = new InsertionSort();
        sortin.sort(arr);

        int minima = arr[0];
        int maxima = arr[arr.length - 1];
        int rango = maxima - minima;

        System.out.print("Arreglo original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo ordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Temperatura minima: " + minima);
        System.out.println("Temperatura maxima: " + maxima);
        System.out.println("Rango: " + rango);

        System.out.print("Top 3 temperaturas mas altas: ");
        for (int i = arr.length - 1; i >= 0 && i >= arr.length - 3; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Top 3 temperaturas mas bajas: ");
        for (int i = 0; i < arr.length && i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
