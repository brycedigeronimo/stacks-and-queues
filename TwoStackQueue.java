public class TwoStackQueue<E> {
    Stack<E> stack1;
    Stack<E> stack2;

    public TwoStackQueue() {
        // Initialize two stacks where stack 1 is a normal stack and stack 2 represents the queue
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqueue(E newData) {
        // push onto stack1
        stack1.push(newData);
    }

    public Node<E> dequeue() {
        //transfer data from stack1 onto stack 2
        transfer();
        if(stack1 == null) {
            return null;
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        // Check if stack1 is empty
        return stack1 == null;
    }

    public void printQueue() {
        // Loop through stack2 and print each Node's data
        Node node = stack2.getTop();
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public void transfer () {
        //tranfer all nodes from stack1 onto stack 2 to get the order correct so that stack2 represents FIFO
        //as a queue should instead of LIFO as a stack does.
        while (!stack1.isEmpty()) {
            Node<E> node = stack1.pop();
            stack2.push(node.getData());
        }
    }

}

