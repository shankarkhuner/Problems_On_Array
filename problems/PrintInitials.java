package problems;


import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the initials
        System.out.print("Enter your initials: ");
        String initials = scanner.nextLine();

        // Example usage
        printInitials(initials);
    }

    public static void printInitials(String initials) {
        // Define the patterns for each initial
        String patternA = "  *  \n * * \n*****\n*   *\n*   *";
        String patternB = "**** \n*   *\n**** \n*   *\n**** ";
        String patternC = " *** \n*   *\n*    \n*   *\n *** ";
        String patternD = "**** \n*   *\n*   *\n*   *\n**** ";
        // Add more patterns for other initials as needed

        // Map initials to their respective patterns
        String[] patterns = {patternA, patternB, patternC, patternD};
        // Add more patterns for other initials as needed

        // Print the initials using the selected patterns
        for (char initial : initials.toUpperCase().toCharArray()) {
            if (initial >= 'A' && initial <= 'Z') {
                int index = initial - 'A';
                System.out.println(patterns[index]);
            } else {
                System.out.println("Invalid initial: " + initial);
            }
        }
    }
}
