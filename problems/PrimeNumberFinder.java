package problems;


import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range of numbers
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        // Example usage
        findAndPrintPrimes(lowerBound, upperBound);
    }

    public static void findAndPrintPrimes(int lowerBound, int upperBound) {
        System.out.println("Prime numbers in the range " + lowerBound + " to " + upperBound + ":");
        
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
