
public class Movie {

    private int date;
    private String title;
    private LinkedList actors;
    private LinkedList directors;

    public Movie(){
        date = 0;
        title = null;
        actors = null;
        directors = null;
    }

    public Movie(int date, String title, LinkedList actors, LinkedList directors){
        this.date = date;
        this.title = title;
        this.actors = actors;
        this.directors = directors;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LinkedList getActors() {
        return actors;
    }

    public void setActors(LinkedList actors) {
        this.actors = actors;
    }

    public LinkedList getDirectors() {
        return directors;
    }

    public void setDirectors(LinkedList directors) {
        this.directors = directors;
    }

    @Override
    public String toString() {
        String dateString = String.valueOf(date) + " ";
        String titleString = title + " ".repeat(33-title.length());
        String actorString = "";
        String directorString = "Dir: ";

        for (int i = 0; i < actors.size() ; i++) {
            if(i == actors.size()-1){
                actorString += ((Actor)actors.get(i).get()).getName();
            }else actorString += ((Actor)actors.get(i).get()).getName() + ", ";

        }

        actorString += " ".repeat(47 - actorString.length());


        for (int i = 0; i < directors.size() ; i++) {
            if(i == directors.size()-1){
                directorString += ((Actor)directors.get(i).get()).getName();;
            }else directorString += ((Actor)directors.get(i).get()).getName() + ", ";;

        }

        return dateString + titleString + actorString + directorString;
    }
}
