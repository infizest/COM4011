import java.util.Scanner;

public class SalesControl {

    public static void SalesData(Scanner scanner) {
        int[] salesQty = new int[5];
        double totalSales = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter sales quantity for item " + (i + 1) + ":");
            salesQty[i] = scanner.nextInt();

            // Calculate total sales
            totalSales += salesQty[i] * StockControlMenu.unitPrice[i];

            // Check stock levels against threshold and display reorder information if needed
            if (StockControlMenu.stockLevel[i] - salesQty[i] < StockControlMenu.threshold[i]) {
                System.out.println("Reorder Item: " + (i + 1) + " | Quantity: " + StockControlMenu.reorderQty[i]);
            }
        }

        System.out.println("Total sales amount: " + totalSales);
    }
}
