import java.util.Scanner;

public class DuckNumber 
{
    public static void main(String[] args) 
{
        Scanner in = new Scanner(System.in);
        
        // Step 1: Input the number
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        
        // Step 2: Convert the number to a string
        String numStr = Integer.toString(n);
        
        // Step 3: Check if the number starts with zero
        if (numStr.charAt(0) == '0') 
{
            System.out.println("INVALID INPUT: Number should not start with zero.");
            return;
        }
        
        // Step 4: Check for presence of '0' in the number
        if (numStr.contains("0")) {
            System.out.println("It is a Duck number.");
        } else {
            System.out.println("It is not a Duck number.");
        }
    }
}
