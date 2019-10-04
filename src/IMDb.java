import java.io.File;
import java.util.*;

public class IMDb{

    public static void main(String[] args) throws Exception {

        Scanner actors = new Scanner(new File("actor.dat"));
        LinkedList actorLinkedList = new LinkedList();

        while (actors.hasNext()){
            actorLinkedList.add(new Actor(actors.nextLine()));
        }

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

        Node currentActor = actorLinkedList.getHead();
        Comparator<Movie> compareByDate = Comparator.comparingInt(Movie::getDate);

        while (currentActor != null){
            System.out.println(((Actor)currentActor.get()).getName());
            ArrayList<Movie> actinmov = new ArrayList<>();
            Node currentMovie = movies.getHead();
            while (currentMovie != null){
                Node currentActorInMovie = ((Movie)currentMovie.get()).getActors().getHead();
                boolean found = false;
                while (currentActorInMovie != null){
                    if(((Actor)currentActorInMovie.get()).getName().equals(((Actor)currentActor.get()).getName())){
                        found = true;
                        break;
                    }
                    currentActorInMovie = currentActorInMovie.getNextPtr();
                }

                if(found) actinmov.add((Movie)currentMovie.get());
                currentMovie = currentMovie.getNextPtr();
            }

            Collections.sort(actinmov, compareByDate);
            for (int i = 0; i < actinmov.size(); i++) {
                System.out.println(actinmov.get(i));
            }

            currentActor = currentActor.getNextPtr();
        }

    }

}
