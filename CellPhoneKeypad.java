import java.util.*;

public class CellPhoneKeypad {

    // Method to get the key sequence for a given character
    public static String getKeyPressSequence(char c) {
        switch (c) {
            case 'a': case 'b': case 'c': return "2";
            case 'd': case 'e': case 'f': return "3";
            case 'g': case 'h': case 'i': return "4";
            case 'j': case 'k': case 'l': return "5";
            case 'm': case 'n': case 'o': return "6";
            case 'p': case 'q': case 'r': case 's': return "7";
            case 't': case 'u': case 'v': return "8";
            case 'w': case 'x': case 'y': case 'z': return "9";
            case ' ': return "0";  // Space corresponds to key '0'
            default: return "";     // Invalid character (not expected)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine().toLowerCase();  // Convert to lowercase

        // Array to track frequency of key presses (for keys 0-9)
        int[] keyFrequency = new int[10];

        // Variable to store the final key press sequence as a String
        String keySequence = "";

        // Process each character in the sentence
        for (char c : sentence.toCharArray()) {
           
           // Get the corresponding key sequence
            String key = getKeyPressSequence(c);

            // If the key is valid (non-empty), append to the sequence and update the frequency
            if (!key.isEmpty()) {
                keySequence += key;  // Append the key to the key sequence
                int keyIndex = Integer.parseInt(key);
                keyFrequency[keyIndex]++;  // Increment the frequency for this key
            }
        }

        // Output the key press sequence
        System.out.println("Key press sequence: " + keySequence);

        // Output the frequency of each key press
        System.out.println("\nKey frequencies:");
        for (int i = 0; i <= 9; i++) {
            if (keyFrequency[i] > 0) {
                System.out.println("Key " + i + ": " + keyFrequency[i] + " times");
            }
        }

        scanner.close();
    }
}

