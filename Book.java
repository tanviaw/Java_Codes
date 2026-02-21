class Book {
    // Declaring instance variables
    String name[];                                       // Array to store names of the books
    int point;                                               // To track the index of the topmost book
    int max;                                                // Maximum capacity of the shelf

    // Constructor to initialize the bookshelf with given capacity
    public Book(int cap) {
        max = cap;                                       // Set the max capacity
        point = -1;    // Initialize to -1 indicating the shelf is empty
        name = new String[max];            // Create an array of strings to store book names
    }

    // Method to display the last entered book (topmost book in stack)
    public void tell() {
        if (point == -1) {
            System.out.println("SHELF EMPTY");                            // If shelf is empty
        } else {
            System.out.println("Last entered: " + name[point]);        // Display topmost book
        }
    }

    // Method to add a new book to the shelf
    public void add(String v) {
        if (point + 1 == max) {
            System.out.println("SHELF FULL");                   // If shelf is full, display an error
        } else {
            name[++point] = v;                          // Increment point and add book to the shelf
        }
    }
}

