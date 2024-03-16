package problems;


import java.util.Scanner;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Get the elements of the array
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Example usage
        int secondSmallest = findSecondSmallest(array);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Indicate an error
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
