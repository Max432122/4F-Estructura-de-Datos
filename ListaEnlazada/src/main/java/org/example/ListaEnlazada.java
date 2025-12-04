package org.example;

public class ListaEnlazada {
    Node head;
    Node headPar;
    Node headImpar;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void ordenarLista() {
        if (head == null) {
            System.out.println("Lista principal vacía.");
            return;
        }

        Node current = head;
        Node colaPar = null;
        Node colaImpar = null;

        while (current != null) {
            Node nuevoNodo = new Node(current.getData());

            if (nuevoNodo.getData() % 2 == 0) {
                if (headPar == null) {
                    headPar = nuevoNodo;
                    colaPar = nuevoNodo;
                } else {
                    colaPar.next = nuevoNodo;
                    colaPar = nuevoNodo;
                }
            } else {
                if (headImpar == null) {
                    headImpar = nuevoNodo;
                    colaImpar = nuevoNodo;
                } else {
                    colaImpar.next = nuevoNodo;
                    colaImpar = nuevoNodo;
                }
            }

            current = current.next;
        }
    }

    private void printList(Node currentHead) {
        if (currentHead == null) {
            System.out.println("Lista vacia (null)");
            return;
        }

        Node current = currentHead;

        while (current != null) {
            System.out.print(current.getData());
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void imprimirListas() {
        System.out.println("Resultado de Separación");
        System.out.print("Lista Inicial Completa: ");
        printList(head);

        System.out.print("Lista de Números Pares: ");
        printList(headPar);

        System.out.print("Lista de Números Impares: ");
        printList(headImpar);
    }
}
