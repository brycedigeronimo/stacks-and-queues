public class Stack<E> {
    private Node<E> top;
    public Stack(){
        // initialize Stack to be empty
        // set top as null
        this.top = null;
    }
    public void push(E newData){
        // create a node whose data is newData and next node is top
        // Push this new node onto the stack
        // Update top
        Node<E> node =  new Node(newData, null);
        node.setNext(top);
        top = node;
    }
    public Node<E> pop(){
        // Use temp node that currently represents the top of the stack
        // Update top
        // return temp
        if(isEmpty()) {
            return null;
        }
        Node<E> node = top;
        top = top.getNext();
        return node;

    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        // Loop through your stack and print each Node's data
        Node<E> node = top;
        while(node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public Node<E> getTop() {
        return this.top;
    }
}

