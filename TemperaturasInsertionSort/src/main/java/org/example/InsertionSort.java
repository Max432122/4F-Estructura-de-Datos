package org.example;

public class InsertionSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            //comentario para poder poner un commit porque me equivoque cuando puse el commit cuando subi este proyecto xd
            arr[j + 1] = temp;
        }

    }
}

