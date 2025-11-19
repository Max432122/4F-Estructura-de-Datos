package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de numeros:  ");
        int cantidad = entrada.nextInt();

        int[] arreglo = new int[cantidad];

        System.out.println("Ingresa los numeros:  ");
        for(int x = 0; x < cantidad; x++){
            arreglo[x] = entrada.nextInt();
        }

        int[] copia = new int[cantidad];
        for(int x = 0; x < cantidad; x++){
            copia[x] = arreglo[x];
        }

        BubbleSort b = new BubbleSort();
        b.sort(copia);

        int minimo = copia[0];
        int maximo = copia[cantidad - 1];
        int diferencia = maximo - minimo;

        System.out.print("Arreglo original: ");
        for(int x = 0; x < cantidad; x++){
            System.out.print(arreglo[x] + " ");
        }

        System.out.println();

        System.out.print("Arreglo ordenado: ");
        for(int x = 0; x < cantidad; x++){
            System.out.print(copia[x] + " ");
        }

        System.out.println();

        System.out.println("Valor minimo: " + minimo);

        System.out.println("Valor maximo: " + maximo);

        System.out.println("Diferencia: " + diferencia);
    }
}
