public class Actor {

    private Actor next;
    private String name;

    public Actor(){
        next = null;
        name = "";
    }

    public Actor(String name){
        next = null;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor getNextPtr() {
        return next;
    }

    public void setNextPtr(Actor next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return name;
    }
}
