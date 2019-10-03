import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ListTester {

    public static void main(String[] args) throws Exception {

        Scanner actors = new Scanner(new File("actor.dat"));
        LinkedList actorLinkedList = new LinkedList();

        while (actors.hasNext()){
            actorLinkedList.add(new Actor(actors.nextLine()));
        }

        for (int i = 0; i < actorLinkedList.size(); i++) {
            if(actorLinkedList.get(i) != null){
                System.out.println(actorLinkedList.get(i));
            }
        }

        System.out.println();

        System.out.println((((Actor) actorLinkedList.get(0).get()).getName()));

        System.out.println();

        Scanner in = new Scanner(new File("movies.txt"));
        LinkedList movies = new LinkedList();


        while (in.hasNext()){
            LinkedList actorsMovies = new LinkedList();
            LinkedList directorMovies = new LinkedList();
            String line = in.nextLine();
            int date = Integer.parseInt(line.substring(0, 4));
            String title = line.substring(4, 38).trim();
            String[] actorArr = line.substring(38, 83).trim().split(", ");
            Arrays.stream(actorArr).forEach(x -> actorsMovies.add(new Actor(x)));
            String[] dirArr = line.substring(89).trim().split(", ");
            Arrays.stream(dirArr).forEach(x -> directorMovies.add(new Actor(x)));
            movies.add(new Movie(date, title, actorsMovies, directorMovies));
        }

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).get());
        }

        System.out.println();

        System.out.println((((Movie) movies.get(0).get()).getTitle()));

    }

}
