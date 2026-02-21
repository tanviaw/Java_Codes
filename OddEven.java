import java.util.Scanner;

public class OddEven 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Accept the size of the arrays
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        // Accept the elements of the first array
        int[] array1 = new int[n1];
        System.out.println("Enter elements for Array 1:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        // Accept the elements of the second array
        int[] array2 = new int[n2];
        System.out.println("Enter elements for Array 2:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        // Create two arrays to hold odd and even numbers
        int[] odd = new int[n1 + n2]; // Maximum size of odd numbers array
        int[] even = new int[n1 + n2]; // Maximum size of even numbers array
        int oddIndex = 0, evenIndex = 0;

        // Process both arrays
        for (int i = 0; i < n1; i++) {
            if (array1[i] % 2 != 0) {
                odd[oddIndex++] = array1[i]; // Odd number found
            } else {
                even[evenIndex++] = array1[i]; // Even number found
            }
        }

        for (int i = 0; i < n2; i++) {
            if (array2[i] % 2 != 0) {
                odd[oddIndex++] = array2[i]; // Odd number found
            } else {
                even[evenIndex++] = array2[i]; // Even number found
            }
        }

        // Create the arranged array by combining odd and even numbers
        int[] arrangedArray = new int[oddIndex + evenIndex];
        int index = 0;

        // Copy odd numbers to the arranged array
        for (int i = 0; i < oddIndex; i++) {
            arrangedArray[index++] = odd[i];
        }

        // Copy even numbers to the arranged array
        for (int i = 0; i < evenIndex; i++) {
            arrangedArray[index++] = even[i];
        }

        // Output the arranged array
        System.out.print("Arranged Array = { ");
        for (int i = 0; i < arrangedArray.length; i++) {
            System.out.print(arrangedArray[i]);
            if (i != arrangedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}
