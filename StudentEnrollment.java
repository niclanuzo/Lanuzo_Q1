import java.util.Scanner;

public class StudentEnrollment {

    // Method to compute total enrollment fee
    public static int computeTotalFee(int units) {
        int feePerUnit = 1000; // Fee per unit is 1000
        return units * feePerUnit;
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input student information
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = sc.nextLine();

        System.out.print("Enter Number of Units (Max: 10): ");
        int numberOfUnits = sc.nextInt();

        // Ensure the number of units does not exceed the limit of 10
        if (numberOfUnits > 10) {
            System.out.println("Error: Maximum number of units is 10. Please try again.");
            return;
        }

        // Compute the total enrollment fee
        int totalFee = computeTotalFee(numberOfUnits);

        // Output student information and total enrollment fee
        System.out.println("\n--- Enrollment Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Total Units: " + numberOfUnits);
        System.out.println("Total Enrollment Fee: " + totalFee + " PHP");

        // Payment processing
        System.out.print("\nEnter Payment Amount: ");
        int paymentAmount = sc.nextInt();

        // Check if the payment is sufficient
        if (paymentAmount == totalFee) {
            System.out.println("Payment Status: Fully Paid");
        } else if (paymentAmount < totalFee) {
            System.out.println("Payment Status: Partial Payment");
            System.out.println("Amount Paid: " + paymentAmount + " PHP");
            System.out.println("Remaining Balance: " + (totalFee - paymentAmount) + " PHP");
        } else {
            System.out.println("Payment Status: Overpayment");
            System.out.println("Amount Paid: " + paymentAmount + " PHP");
            System.out.println("Change: " + (paymentAmount - totalFee) + " PHP");
        }

        // Close the scanner
        sc.close();
    }
}
