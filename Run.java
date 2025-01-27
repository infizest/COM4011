import java.io.FileWriter;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        StockControlMenu.main(null);
        generateCSV();
    }

    public static void generateCSV() {
        String fileName = "stock_sales_report.csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            // Writing the header row
            writer.append("Item,Stock Level,Unit Price,Reorder Threshold,Reorder Quantity,Total Sales\n");

            // Loop through the stock data and sales data
            for (int i = 0; i < StockControlMenu.stockLevel.length; i++) {
                double totalSales = StockControlMenu.unitPrice[i] * StockControlMenu.stockLevel[i];

                writer.append("Item " + (i + 1) + ",");
                writer.append(StockControlMenu.stockLevel[i] + ",");
                writer.append(StockControlMenu.unitPrice[i] + ",");
                writer.append(StockControlMenu.threshold[i] + ",");
                writer.append(StockControlMenu.reorderQty[i] + ",");
                writer.append(totalSales + "\n");
            }

            System.out.println("CSV file created successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error while writing the CSV file: " + e.getMessage());
        }
    }
}
