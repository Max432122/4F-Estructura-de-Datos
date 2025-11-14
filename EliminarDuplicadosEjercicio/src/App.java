import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {4, 2, 9, 2, 4, 7, 1};

        System.out.println("Original: " + Arrays.toString(arr));

        OrdenadorArreglo ordenador = new OrdenadorArreglo();

        ordenador.ordenarBurbuja(arr);

        System.out.println("Ordenado: " + Arrays.toString(arr));

        int[] arregloUnico = ordenador.eliminarDuplicados(arr);

        System.out.println("Sin Duplicados: " + Arrays.toString(arregloUnico));
    }
}