import java.util.Scanner;

public class SentenceProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine().trim();

        // Check if the sentence ends with '.', '!', or '?'
        char lastChar = sentence.charAt(sentence.length() - 1);
        if (lastChar != '.' && lastChar != '!' && lastChar != '?') {
            System.out.println("Invalid sentence termination.");
            return;
        }

        // Remove the terminating character
        sentence = sentence.substring(0, sentence.length() - 1);

        // Split the sentence into words
        String[] words = sentence.split(" ");
        int length = words.length;

        // Convert all words to uppercase
        for (int i = 0; i < length; i++) {
            words[i] = words[i].toUpperCase();
        }

        // Sort the words alphabetically
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    // Swap words[i] and words[j]
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        // Combine sorted words into a rearranged sentence
        String rearranged = String.join(" ", words);

        // Output the results
        System.out.println("LENGTH: " + length);
        System.out.println("REARRANGED SENTENCE:");
        System.out.println(rearranged);
    }
}
