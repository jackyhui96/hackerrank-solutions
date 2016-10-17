public class Solution {
    // Write your code here.

    Stack<Character> stack;
    Queue<Character> queue;
    public Solution() {
        stack = new Stack<Character>();
        queue = new LinkedList<Character>();
    }

    public void pushCharacter(char ch) {
        stack.push(new Character(ch));
    }

    public void enqueueCharacter(char ch) {
        queue.add(new Character(ch));
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.remove();
    }