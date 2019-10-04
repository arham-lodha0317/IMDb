public class LinkedList {
    private Node head;
    private int count;

    public LinkedList(){
        head = null;
        count = 0;
    }

    public void add(Object object){
        Node node = new Node(object);
        node.setNextPtr(head);
        head = node;
        count++;
    }

    public Node getHead() {
        return head;
    }

    public Node get(int index){
        if(index < 0 || index >= count){
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNextPtr();
        }

        return current;
    }

    public int size() {
        return count;
    }


}
