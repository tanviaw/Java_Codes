import java.util.*;
public class mf{
    // Function to calculate Mobius function M(N)
    public static int mobius(int N) {
        if (N == 1) {
            return 1;
        }
        int primeFactorsCount = 0;
        int duplicatePrimeFactor = 0;

        // Check for number of distinct prime factors and duplicates
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                primeFactorsCount++;
                if ((N / i) % i == 0) {
                    duplicatePrimeFactor = 1;
                }
                while (N % i == 0) {
                    N /= i;
                }
            }
        }
        if (N > 1) {
            primeFactorsCount++;
        }

        if (duplicatePrimeFactor == 1) {
            return 0;
        } else if (primeFactorsCount % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    // Function to print the prime factors
    public static List<Integer> primeFactors(int N) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                factors.add(i);
                N /= i;
            }
        }
        if (N > 1) {
            factors.add(N);
        }
        return factors;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        int N = sc.nextInt();

        List<Integer> factors = primeFactors(N);
        System.out.print("OUTPUT: " + N + " = ");
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i));
            if (i < factors.size() - 1) {
                System.out.print(" x ");
            }
        }
        System.out.println();

        Set<Integer> distinctFactors = new HashSet<>(factors);
        if (distinctFactors.size() < factors.size()) {
            System.out.println("DUPLICATE PRIME FACTORS");
        } else {
            System.out.println("NUMBER OF DISTINCT PRIME FACTORS = " + distinctFactors.size());
        }

        System.out.println("M(" + N + ") = " + mobius(N));
    }
}


