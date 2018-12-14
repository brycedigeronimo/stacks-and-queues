public class Queue<E> {
    private Node<E> head;
    private Node<E> tail;
    public Queue(){
        // initialize Queue to be empty
        // set head and tail to be null
        this.head = null;
        this.tail = null;
    }

    public void enqueue(E newData){
        // Create a new node whose data is newData and whose next node is null
        Node node = new Node(newData,null);

        // Update head and tail

        //Queue currently empty
        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        //Queue not empty
        tail.setNext(node);
        tail = node;
    }

    public Node<E> dequeue(){
        if (isEmpty()) {
            return null;
        }

        //set temp = current head, update head equal to head.next, and return temp
        Node<E> value = head;
        head = head.getNext();
        return value;

    }
    public boolean isEmpty(){
        // Check if Queue is empty
        return head == null;
    }

    public void printQueue(){
        // Loop through queue and print each Node's data
        Node<E> node = head;
        while(node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}

