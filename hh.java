import java.util.*;

public class hh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence (terminated by '.', '?' or '!'): ");
        String inputSentence = scanner.nextLine().trim();
        
        if (!isValidSentence(inputSentence)) {
            System.out.println("Invalid input sentence. It should end with '.', '?' or '!' and contain only lowercase letters and spaces.");
            return;
        }
        
        String[] words = inputSentence.split("\\s+");
        
        // Sort words based on length (ascending) and maintain original order for words of the same length
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return 0; // Maintain original order for words of the same length
            }
        });
        
        // Capitalize the first letter of the input sentence
        String capitalizedInput = capitalizeSentence(inputSentence);
        
        // Generate the output sentence
        String outputSentence = String.join(" ", words);
        
        // Capitalize the first letter of the output sentence
        String capitalizedOutput = capitalizeSentence(outputSentence);
        
        // Print the results
        System.out.println("\nOUTPUT:");
        System.out.println(capitalizedInput);
        System.out.println(capitalizedOutput);
        
        scanner.close();
    }
    
    // Method to check if the sentence is valid (ends with '.', '?' or '!')
    private static boolean isValidSentence(String sentence) {
        char lastChar = sentence.charAt(sentence.length() - 1);
        return (lastChar == '.' || lastChar == '?' || lastChar == '!');
    }
    
    // Method to capitalize the first letter of a sentence
    private static String capitalizeSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        return Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
    }
}
