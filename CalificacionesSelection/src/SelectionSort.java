public class SelectionSort {

    public void sort(double[] calificaciones, String[] nombres) {
        int n = calificaciones.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (calificaciones[j] < calificaciones[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                double tempCalificacion = calificaciones[minIndex];
                calificaciones[minIndex] = calificaciones[i];
                calificaciones[i] = tempCalificacion;

                String tempNombre = nombres[minIndex];
                nombres[minIndex] = nombres[i];
                nombres[i] = tempNombre;
            }
        }
    }
}