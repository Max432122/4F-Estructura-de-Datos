import java.util.ArrayDeque;
import java.util.Deque;

public class Client {
    int id;
    String name;
    Deque<String> docs;

    Client(int id, String name) {
        this.id = id;
        this.name = name;
        docs = new ArrayDeque<>();
    }

    public void addDocument(String newDoc) {
        docs.push(newDoc);
    }

    public void attend() {
        while (!docs.isEmpty()) {
            System.out.println("Documento retirado: " + docs.pop());
        }
    }

    @Override
    public String toString() {
        return name;
    }
}