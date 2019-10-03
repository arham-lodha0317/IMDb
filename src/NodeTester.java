import java.io.File;
import java.util.Scanner;

public class NodeTester {

    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("actor.dat"));
        Node head = new Node(new Actor(file.nextLine()));

        while (file.hasNext()){
            Node newNode = new Node(new Actor(file.nextLine()));
            newNode.setNextPtr(head);
            head = newNode;
        }

        Node current = head;

        while (current != null){
            System.out.println(current.get());
            current = current.getNextPtr();
        }

        System.out.println(((Actor) head.get()).getName());

    }


}
