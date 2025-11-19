package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de numeros:");
        int n = entrada.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingresa los numeros:");
        for (int i = 0; i < n; i++) arr[i] = entrada.nextInt();

        int minIndex = 0, j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) minIndex++;
            else j++;
        }

        int[] pares = new int[minIndex];
        int[] impares = new int[j];

        int temp = 0, i2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) pares[temp++] = arr[i];
            else impares[i2++] = arr[i];
        }

        SelectionSort sorting = new SelectionSort();

        sorting.sort(pares);

        sorting.sort(impares);

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Pares ordenados:");
        System.out.println(Arrays.toString(pares));

        System.out.println("Impares ordenados:");
        System.out.println(Arrays.toString(impares));
    }
}
