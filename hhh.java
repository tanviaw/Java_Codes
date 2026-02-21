import java.util.Scanner;

class hhh {
    // Instance variables
    private int num;
    private int revnum;

    // Constructor to initialize data members
    public hhh() {
        num = 0;
        revnum = 0;
    }

    // Method to accept the number from the user
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        num = scanner.nextInt();
    }

    // Recursive method to reverse a number
    public int reverse(int y) {
        // Base case
        if (y == 0) {
            return revnum;
        }
        // Recursive case: build the reversed number
        revnum = revnum * 10 + (y % 10);
        return reverse(y / 10);
    }

    // Method to check if the number is a palindrome
    public void check() {
        // Reset revnum to zero before reversing
        revnum = 0;
        int reversedNumber = reverse(num);

        // Display the result based on palindrome check
        if (num == reversedNumber) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    public static void main(String[] args) {
        // Create an object of Palin and use its methods
        hhh obj = new hhh();
        obj.accept();
        obj.check();
    }
}
