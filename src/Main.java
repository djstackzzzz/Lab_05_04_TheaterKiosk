import java.util.Scanner;

class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for age
        System.out.print("Enter your age: ");

        // Validate input
        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine(); // Clear input buffer

            // Check age condition
            if (age >= 21) {
                System.out.println("You get a wristband.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        in.close();
    }
}
