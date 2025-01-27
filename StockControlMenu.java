import java.util.Scanner;
// Task 1 : Menu
public class StockControlMenu {
    // Shared arrays for stock data
    static String[] productId = new String[5]; 
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
                    StockData(scanner);
                    break;
                case 2:
                    SalesData(scanner);
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

    // Task 2 : Entry Stock Data

    public static void StockData(Scanner scanner) {
        double totalCost = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product ID for item " + (i + 1) + " (e.g., cd5751):");
            productId[i] = scanner.next(); 

            System.out.println("Enter stock level for product ID " + productId[i] + ":");
            stockLevel[i] = scanner.nextInt();

            System.out.println("Enter unit price for product ID " + productId[i] + ":");
            unitPrice[i] = scanner.nextDouble();

            System.out.println("Enter reorder threshold for product ID " + productId[i] + ":");
            threshold[i] = scanner.nextInt();

            System.out.println("Enter reorder quantity for product ID " + productId[i] + ":");
            reorderQty[i] = scanner.nextInt();

            totalCost += stockLevel[i] * unitPrice[i];
        }

        System.out.println("The total cost of stock is: " + totalCost);
    }
// Task 3 : Sales Entry
    public static void SalesData(Scanner scanner) {
        int[] salesQty = new int[5];
        double totalSales = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter sales quantity for product ID " + productId[i] + ":");
            salesQty[i] = scanner.nextInt();

          
            totalSales += salesQty[i] * unitPrice[i];

        
            if (stockLevel[i] - salesQty[i] < threshold[i]) {
                System.out.println("Reorder Product ID: " + productId[i] + " | Quantity: " + reorderQty[i]);
            }
        }

        System.out.println("Total sales amount: " + totalSales);
    }
}
