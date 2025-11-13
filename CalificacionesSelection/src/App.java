import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas calificaciones desea registrar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[n];
        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAlumno " + (i + 1) + ".");

            System.out.println("El nombre del alumno:");
            nombres[i] = scanner.nextLine();

            System.out.println("La calificacion correspondiente:");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        SelectionSort sorting = new SelectionSort();
        sorting.sort(calificaciones, nombres);

        System.out.println("\n--- Resultados Ordenados (Calificacion - Nombre) ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f - %s\n", calificaciones[i], nombres[i]);
        }

        scanner.close();
    }
}