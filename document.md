# Stock Control and Sales Management System

This Java application provides a menu-driven system for managing stock and sales data for a small inventory. It allows users to input stock details, sales data, and generates a CSV report summarizing the stock and sales information.

## Features
1. **Stock Data Entry**:
   - Enter product ID, stock level, unit price, reorder threshold, and reorder quantity for up to 5 products.
   - Calculates and displays the total cost of stock.

2. **Sales Data Entry**:
   - Enter sales quantity for each product.
   - Calculates the total sales amount.
   - Checks if stock levels fall below the reorder threshold and recommends reordering.

3. **CSV Report Generation**:
   - Automatically generates a CSV file (`stock_sales_report.csv`) summarizing product stock, sales data, and the grand total sales.

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or later.
- A text editor or IDE to edit and run the Java code.

## Installation
1. Clone or download the repository to your local machine.
2. Save the following Java files in the same directory:
   - `StockControlMenu.java`
   - `Run.java`

## Usage
### Step 1: Compile the Code
1. Open a terminal or command prompt.
2. Navigate to the directory where the Java files are saved.
3. Compile the files:
   ```bash
   javac StockControlMenu.java Run.java
