public class OrdenadorArreglo {
    public void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    intercambiar(arr, j, j + 1);
                }
            }
        }
    }

    private void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] eliminarDuplicados(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            return new int[0];
        }

        int contadorUnicos = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                contadorUnicos++;
            }
        }

        int[] arregloUnico = new int[contadorUnicos];
        int indiceUnico = 0;

        arregloUnico[indiceUnico++] = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arregloUnico[indiceUnico++] = arr[i];
            }
        }

        return arregloUnico;
    }
}