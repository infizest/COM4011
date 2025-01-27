// Task 1 : Menu Display and Input Validation

import java.util.Scanner;

public class StockControlMenu {
    // Shared arrays for stock data
    static int[] stockLevel = new int[5];
    static double[] unitPrice = new double[5];
    static int[] threshold = new int[5];
    static int[] reorderQty = new int[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Stock Control Menu");
            System.out.println("1. Enter stock data");
            System.out.println("2. Enter sales data");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    StockControl.StockData(scanner);
                    break;
                case 2:
                    SalesControl.SalesData(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }
}
