import java.util.Arrays;

class SelectionSort {
    public void sort(int[] arr){

        int n = arr.length;

        //Bucle externo: recorre el arreglo, el límite de la parte ordenada crece en cada iteración
        for (int i = 0; i < n - 1; i++) {

            // 1. Encontrar el índice del elemento más pequeño en la parte no ordenada [i...n-1]
            int minIndex = i; //seleccionamos el primero como el menor

            // Bucle interno: busca el menor en el subarreglo no ordenado
            for (int j = i + 1; j < arr.length; j++) { //Iniciamos desde la parte no ordenada
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; //indice del menor dentro de la parte no ordenada
                }
            }

            // Intercambio de posicion: pasa el menor a la posicion indicada de la parte ordenada (i)
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        //Imprimir el arreglo ordenado
        System.out.println(Arrays.toString(arr));
    }
}