package problems;


//public class FrienName {
//    public static void main(String[] args) {
//        // Example usage
//        printGreetings("Mahesh", "Suresh", "Devesh");
//    }
//
//    public static void printGreetings(String friend1, String friend2, String friend3) {
//        // Reverse the order of friends' names
//        String[] reversedNames = {friend3, friend2, friend1};
//
//        // Join the reversed names with commas and add "and" before the last name
//        String formattedOutput = String.join(", ", reversedNames[0], reversedNames[1]) + " and " + reversedNames[2];
//
//        // Print the greeting
//        System.out.println("Hi " + formattedOutput);
//    }
//}

//
//import java.util.Scanner;
//
//public class FrienName {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Get the number of friends
//        System.out.print("Enter the number of friends: ");
//        int numberOfFriends = scanner.nextInt();
//        scanner.nextLine();  // Consume the newline character
//
//        // Get the friends' names
//        String[] friends = new String[numberOfFriends];
//        for (int i = 0; i < numberOfFriends; i++) {
//            System.out.print("Enter friend " + (i + 1) + "'s name: ");
//            friends[i] = scanner.nextLine();
//        }
//
//        // Example usage
//        printGreetings(friends);
//    }
//
//    public static void printGreetings(String[] friends) {
//        // Reverse the order of friends' names
//        for (int i = 0; i < friends.length / 2; i++) {
//            String temp = friends[i];
//            friends[i] = friends[friends.length - 1 - i];
//            friends[friends.length - 1 - i] = temp;
//        }
//
//        // Join the reversed names with commas and add "and" before the last name
//        String formattedOutput = String.join(", ", friends[0], friends[1]) + " and " + friends[2];
//
//        // Print the greeting
//        System.out.println("Hi " + formattedOutput);
//    }
//}
//

import java.util.Scanner;

public class FrienName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of friends
        System.out.print("Enter the number of friends: ");
        int numberOfFriends = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Get the friends' names
        String[] friends = new String[numberOfFriends];
        for (int i = 0; i < numberOfFriends; i++) {
            System.out.print("Enter friend " + (i + 1) + "'s name: ");
            friends[i] = scanner.nextLine();
        }

        // Example usage
        printGreetings(friends);
    }

    public static void printGreetings(String[] friends) {
        // Print the greeting in reverse order
        System.out.print("Hi ");
        for (int i = friends.length - 1; i > 0; i--) {
            System.out.print(friends[i] + ", ");
        }
        System.out.println("and " + friends[0]);
    }
}

