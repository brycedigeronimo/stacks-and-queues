import java.util.Scanner;
public class EC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProblems = scanner.nextInt();
        String string = scanner.nextLine();

        for (int i = 0; i < numProblems; ++i) {
            string = scanner.nextLine();
            Boolean palindrome = isPalindrome(string);
            if(palindrome) {
                System.out.println("This is a Palindrome.");
            } else {
                System.out.println("Not a Palindrome.");
            }
        }
        scanner.close();
    }

    public static boolean isPalindrome(String s) {
        TwoStackQueue<Character> twoStackQueue = new TwoStackQueue<>(); //create queue represented by two stacks
        Stack<Character> stack = new Stack();
        String stackString = "";
        String twoStackQueueString = "";
        for(int i = 0; i < s.length(); i++) { //push each character from string onto stack and twoStackQueue
            stack.push(s.charAt(i));
            twoStackQueue.enqueue(s.charAt(i));
        }
        twoStackQueue.transfer(); //transfer from stack 1 to stack 2 to flip order of characters
        for(int i = 0; i < s.length(); i++) {
            stackString += stack.pop().getData();
            twoStackQueueString += twoStackQueue.dequeue().getData();
        }

        return twoStackQueueString.equals(stackString);
    }
}

