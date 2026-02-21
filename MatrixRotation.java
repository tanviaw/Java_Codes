import java.util.Scanner;

public class MatrixRotation 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Accept the matrix order M (ensure 3 <= M <= 9)
        System.out.print("Enter the order of matrix (M): ");
        int M = scanner.nextInt();
        
        if (M < 3 || M > 9) 
{
            System.out.println("INVALID INPUT. M must be between 3 and 9.");
            return;
        }
        
        // Step 2: Declare the matrix A[][] and accept user input for the matrix
        int[][] A = new int[M][M];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        // Step 3: Display the original matrix
        System.out.println("ORIGINAL MATRIX:");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < M; j++) 
           {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        // Step 4: Rotate the matrix 90 degrees clockwise
        int[][] rotatedA = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                rotatedA[j][M-1-i] = A[i][j];  // Rotate element
            }
        }
        
        System.out.println("ROTATED MATRIX:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(rotatedA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
