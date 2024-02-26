import java.util.Scanner;

public class classchoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            // Prompt the user for input regarding course attributes
            System.out.println("Enter the following information to evaluate the course:");
            System.out.print("Fun level (1-10): ");
            int F = scanner.nextInt();
            System.out.print("Professor coolness (1-10): ");
            int C = scanner.nextInt();
            System.out.print("Necessity for graduation (1 for yes, 2 for no): ");
            int N = scanner.nextInt();
            System.out.print("Class start time (hours after waking up): ");
            int H = scanner.nextInt();
            System.out.print("Pass probability (0-1): ");
            float P = scanner.nextFloat();
            System.out.print("Repeat status (1 for no, 2 for yes): ");
            int R = scanner.nextInt();
            System.out.print("Are any smart friends taking this class? (1 for no, 2 for yes): ");
            int S = scanner.nextInt();
            // Helps make adjustments for the result(s)
            float X = 0.07f;

            // Calculate the suitability score for the course
            float A = ((F + (C / N) + H * (P / R * S)) * X);

            // Determined whether to sign up for the course based on the calculated score
            if (A >= 1) {
                System.out.println("Based on the provided data, you should take this class. The calculated score is: " + A);
            } else {
                System.out.println("Based on the provided data, you should not take this class. The calculated score is: " + A);
            }

            // Ask the user if they want to use the course selector again
            System.out.print("Do you want to evaluate another course? (1 for yes, 2 for no): ");
            int choice = scanner.nextInt();
            repeat = (choice == 1);
        }

        System.out.println("Thanks for using the course selector :) !");
        scanner.close();
    }
}
