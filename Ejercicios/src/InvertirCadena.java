public class InvertirCadena {

    public static void main(String[] args) {
        String texto = "hola";
        System.out.print("El texto invertido es: ");
        invertir(texto);
    }

    public static void invertir(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            System.out.print(cadena);
        } else {
            System.out.print(cadena.charAt(cadena.length() - 1));
            invertir(cadena.substring(0, cadena.length() - 1));
        }
    }
}