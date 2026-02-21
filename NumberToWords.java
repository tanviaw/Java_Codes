import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the natural number
        System.out.print("Enter a natural number less than 1000: ");
        int num = sc.nextInt();

        // Check if the number is out of range
        if (num < 0 || num >= 1000) {
            System.out.println("OUT OF RANGE");
            return;
        }

        // Arrays for number words
        String[] units = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String[] tens = {"", "TEN", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
        String[] teens = {"ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};

        String words = "";

        // Process hundreds place
        if (num >= 100) {
            int hundreds = num / 100;
            words += units[hundreds] + " HUNDRED";
            num %= 100; // Update num to process tens and units
            if (num > 0) {
                words += " AND ";
            }
        }

        // Process tens and units
        if (num >= 11 && num <= 19) {
            words += teens[num - 11];
        } else {
            int tensPlace = num / 10;
            int unitsPlace = num % 10;

            if (tensPlace > 0) {
                words += tens[tensPlace];
                if (unitsPlace > 0) {
                    words += " ";
                }
            }
            if (unitsPlace > 0) {
                words += units[unitsPlace];
            }
        }

        // Output the result
        System.out.println(words);
    }
}
