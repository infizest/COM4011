import java.util.Scanner;

public class StockControl {

    public static void StockData(Scanner scanner) {
        double totalCost = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter stock level for item " + (i + 1) + ":");
            StockControlMenu.stockLevel[i] = scanner.nextInt();

            System.out.println("Enter unit price for item " + (i + 1) + ":");
            StockControlMenu.unitPrice[i] = scanner.nextDouble();

            System.out.println("Enter reorder threshold for item " + (i + 1) + ":");
            StockControlMenu.threshold[i] = scanner.nextInt();

            System.out.println("Enter reorder quantity for item " + (i + 1) + ":");
            StockControlMenu.reorderQty[i] = scanner.nextInt();

            totalCost += StockControlMenu.stockLevel[i] * StockControlMenu.unitPrice[i];
        }

        System.out.println("The total cost of stock is: " + totalCost);
    }
}
