public class SumaRecursiva {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de los primeros " + n + " números es: " + suma(n));
    }

    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }
}
