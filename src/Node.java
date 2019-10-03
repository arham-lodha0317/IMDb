public class Node {

    private Node next;
    private Object data;

    public Node(){
        next = null;
        data = null;
    }

    public Node(Object object){
        next = null;
        data = object;
    }


    public Object get(){
        return data;
    }

    public void set(Object data){
        this.data = data;
    }

    public Node getNextPtr() {
        return next;
    }

    public void setNextPtr(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
