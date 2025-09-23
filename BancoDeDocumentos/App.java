import java.util.ArrayDeque;
import java.util.Queue;


public class App {
    public static void main(String[] args) throws Exception {
        Queue<Client> queue = new ArrayDeque<>();

        Client c1 = new Client(1, "Juanito");
        c1.addDocument("Doc 1 de Juanito");
        c1.addDocument("Doc 2 de Juanito");

        Client c2 = new Client(2, "Juanita");
        c2.addDocument("Doc 1 de Juanita");
        c2.addDocument("Doc 2 de Juanita");

        Client c3 = new Client(3, "Pedro");
        c3.addDocument("Doc 1 de Pedro");
        c3.addDocument("Doc 2 de Pedro");

        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);

        System.out.println("Cola inicial: " + queue);

        Client clienteAtendido = queue.poll();
        if (clienteAtendido != null) {
            System.out.println("Cliente en atencion: " + clienteAtendido.name);
            clienteAtendido.attend();
        }

        System.out.println("Cola restante: " + queue);
    }
}