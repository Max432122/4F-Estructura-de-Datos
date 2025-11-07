import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] arr){
        int n = arr.length;
        //Recorre todos los elementos del arreglo
        for (int i = 0; i < n - 1; i++) {
            // Bandera para optimización: si no hay intercambios, el arreglo está ordenado.
            boolean swapped = false;
            // Recorremos los elementos adyacentes hasta la posición n - 1 - i
            // La condición se reduce en 'i' porque los últimos 'i' elementos ya están ordenados.
            for (int j = 0; j < n - 1 - i; j++){
                // Pregunta si el elemento actual es mayor que el siguiente
                if(arr[j] > arr[j+1]){
                    // Se realiza el intercambio
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // Se realizó un intercambio
                    swapped = true;
                }
            }
            // Si no hubo ningún intercambio en esta pasada, el arreglo ya está ordenado
            if (!swapped) {
                break;
            }
        }
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }
}