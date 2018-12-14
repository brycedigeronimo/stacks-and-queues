import java.util.Scanner;
public class lab1 {
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
        /*Create a stack and a queue and for each character, push onto stack and enqueue into queue.
        Use dequeue from queue to get the string from left to right and use pop from the stack to get the
        string from right to left. Compare the two values and if they are equal, then a palindrome exists.
        */
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new Queue<>();
        String stackString = "";
        String queueString = "";
        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            queue.enqueue(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++) {
            stackString += stack.pop().getData();
            queueString += queue.dequeue().getData();
        }
        return stackString.equals(queueString);

    }
}





