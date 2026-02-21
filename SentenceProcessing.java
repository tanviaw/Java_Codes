import java.util.*;

public class SentenceProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a sentence (terminated by '.', '?' or '!'): ");
        String inputSentence = scanner.nextLine().trim();
        
        if (!isValidSentence(inputSentence)) {
            System.out.println("Invalid input sentence. It should end with '.', '?' or '!' and contain only lowercase letters and spaces.");
            return;
        } 
        
        // Capitalizing the first letter of the input sentence
        String capitalizedInput = capitalizeSentence(inputSentence);
        
        // Splitting the sentence into words
        String[] words = inputSentence.split("\\s+");
        
        // Sorting words in reverse order of their appearance
        Arrays.sort(words, (a, b) -> {
            return b.compareTo(a); // Reverse alphabetical order
        });
        
        String outputSentence = String.join(" ", words);
        
        // Capitalizing the first letter of the sorted sentence
        String capitalizedOutput = capitalizeSentence(outputSentence);
        
        // Displaying the output
        System.out.println("\nOUTPUT:");
        System.out.println(capitalizedInput);
        System.out.println(capitalizedOutput); 
        
        scanner.close();
    }

    private static boolean isValidSentence(String sentence) {
        char lastChar = sentence.charAt(sentence.length() - 1);
        return (lastChar == '.' || lastChar == '?' || lastChar == '!');
    }

    private static String capitalizeSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        return Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
    }
}
