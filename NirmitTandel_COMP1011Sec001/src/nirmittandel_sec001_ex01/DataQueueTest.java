package nirmittandel_sec001_ex01;

import java.util.Scanner;

// ModifiedQueueTest.java
public class DataQueueTest {
	public static void main(String[] args) {
        // Create a Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Testing with Strings
        DataQueue<String> stringQueue = new DataQueue<>();
        stringQueue.enqueue("First");
        stringQueue.enqueue("Second");
        stringQueue.enqueue("Third");

        // Display the contents of the String Queue
        System.out.println("String Queue:");
        stringQueue.printQueue();

        // Dequeue an element from the String Queue
        System.out.println("Dequeued: " + stringQueue.dequeue());

        // Display the String Queue after dequeue operation
        System.out.println("String Queue after dequeue:");
        stringQueue.printQueue();

        // Separator for better readability
        System.out.println("\n---------------------------------\n");

        // Testing with ModifiedStock objects
        DataQueue<ModifiedStock> stockQueue = new DataQueue<>();
        stockQueue.enqueue(getStockFromUserInput(scanner));
        stockQueue.enqueue(getStockFromUserInput(scanner));
        stockQueue.enqueue(getStockFromUserInput(scanner));

        // Display the contents of the Stock Queue
        System.out.println("Stock Queue:");
        stockQueue.printQueue();

        // Dequeue an element from the Stock Queue and display
        System.out.println("Dequeued: " + stockQueue.dequeue().toString());

        // Display the Stock Queue after dequeue operation
        System.out.println("Stock Queue after dequeue:");
        stockQueue.printQueue();

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to get ModifiedStock information from user input
    private static ModifiedStock getStockFromUserInput(Scanner scanner) {
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.next();

        System.out.print("Enter stock price: ");
        double price = scanner.nextDouble();

        // Return a new ModifiedStock object with user input
        return new ModifiedStock(symbol, price);
    }
}

// Class representing a stock with a symbol and a price
class ModifiedStock {
    private String stockSymbol;
    private double stockPrice;

    // Constructor for ModifiedStock
    public ModifiedStock(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
    }

    // Override toString to provide a custom string representation
    @Override
    public String toString() {
        return "ModifiedStock{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", stockPrice=" + stockPrice +
                '}';
    }
}