public class WordPile {
    
    private char[] ch;         // Array to hold characters
    private int capacity;      // Maximum capacity of the pile
    private int top;           // Index of the topmost element

    public WordPile(int cap) {
        capacity = cap;
        top = -1;
        ch = new char[capacity];
    }

    public void pushChar(char v) {
        if (top >= capacity - 1) {
            System.out.println("WordPile is full");
        } else {
            ch[++top] = v; // Increment top and add character
        }
    }

    public char popChar() {
        if (top == -1) {
            return '\\'; // Return '\\' if the pile is empty
        } else {
            return ch[top--]; // Return top character and decrement top
        }
    }
}


