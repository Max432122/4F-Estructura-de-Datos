package org.example;

public class App {
    public static void main(String[] args) {
        ListaEnlazada miListaPrincipal = new ListaEnlazada();

        miListaPrincipal.add(11);
        miListaPrincipal.add(2);
        miListaPrincipal.add(5);
        miListaPrincipal.add(8);
        miListaPrincipal.add(1);
        miListaPrincipal.add(10);
        miListaPrincipal.add(3);

        System.out.println("Inicializando la lista con elementos.");

        miListaPrincipal.ordenarLista();

        miListaPrincipal.imprimirListas();
    }
}