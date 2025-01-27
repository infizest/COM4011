import java.io.FileWriter;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        StockControlMenu.main(null);
        generateCSV();
    }

    public static void generateCSV() {
        String fileName = "stock_sales_report.csv";
        double grandTotalSales = 0; // To track the sum of total sales
 
        try (FileWriter writer = new FileWriter(fileName)) {
            // Writing the header row
            writer.append("Product ID,Stock Level,Unit Price,Reorder Threshold,Reorder Quantity,Total Sales\n");

            // Loop through the stock data and calculate total sales
            for (int i = 0; i < StockControlMenu.stockLevel.length; i++) {
                double totalSales = StockControlMenu.stockLevel[i] * StockControlMenu.unitPrice[i];
                grandTotalSales += totalSales; // Accumulate total sales

                // Write row data to the CSV
                writer.append(StockControlMenu.productId[i] + ","); // Product ID
                writer.append(StockControlMenu.stockLevel[i] + ",");
                writer.append(StockControlMenu.unitPrice[i] + ",");
                writer.append(StockControlMenu.threshold[i] + ",");
                writer.append(StockControlMenu.reorderQty[i] + ",");
                writer.append(totalSales + "\n");
            }

            // Write the grand total sales as the last row
            writer.append("\n");
            writer.append(",,,Grand Total Sales,,," + grandTotalSales + "\n");

            System.out.println("CSV file created successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error while writing the CSV file: " + e.getMessage());
        }
    }
}
