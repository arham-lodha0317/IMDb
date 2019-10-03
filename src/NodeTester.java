import java.io.File;
import java.util.Scanner;

public class NodeTester {

    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("actor.dat"));
        Actor head = new Actor(file.nextLine());

        while (file.hasNext()){
            Actor newActor = new Actor(file.nextLine());
            newActor.setNextPtr(head);
            head = newActor;
        }

        Actor current = head;

        while (current != null){
            System.out.println(current.getName());
            current = current.getNextPtr();
        }

        System.out.println(head);

    }


}
