import java.io.File;
import java.util.Scanner;

public class ListTester {

    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("actor.dat"));
        LinkedList actorLinkedList = new LinkedList();

        while (file.hasNext()){
            actorLinkedList.add(new Actor(file.nextLine()));
        }

        for (int i = 0; i < actorLinkedList.size(); i++) {
            System.out.println(actorLinkedList.get(i));
        }

        System.out.println((((Actor) actorLinkedList.get(0).get()).getName()));
    }

}
