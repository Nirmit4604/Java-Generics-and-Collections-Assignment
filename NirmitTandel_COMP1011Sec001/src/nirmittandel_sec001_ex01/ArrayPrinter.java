package nirmittandel_sec001_ex01;

import java.util.Scanner;

public class ArrayPrinter {

	// Generic method to print the entire array
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Generic method to print the array starting from a specified index
    public static <T> void printArray(T[] inputArray, int startIndex) {
        // Check if the startIndex is valid
        if (startIndex < 0 || startIndex >= inputArray.length) {
            System.out.println("Invalid startIndex. It should be non-negative and less than the array size.");
            return;
        }

        // Print the array from the specified index
        for (int i = startIndex; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    // Generic method to print the array within a specified range of indices
    public static <T> void printArray(T[] inputArray, int startIndex, int endIndex) {
        // Check if the indices are valid
        if (startIndex < 0 || endIndex < 0 || startIndex >= inputArray.length || endIndex > inputArray.length || startIndex >= endIndex) {
            System.out.println("Invalid indices. Both indices should be non-negative, and startIndex should be smaller than endIndex.");
            return;
        }

        // Print the array within the specified range of indices
        for (int i = startIndex; i < endIndex; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Double Array
        System.out.print("Enter the number of elements for the double array: ");
        int doubleArrayLength = scanner.nextInt();
        Double[] grades = new Double[doubleArrayLength];

        System.out.println("Enter elements for the Double Array:");
        for (int i = 0; i < doubleArrayLength; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Input for String Array
        System.out.print("Enter the number of elements for the string array: ");
        int stringArrayLength = scanner.nextInt();
        String[] product = new String[stringArrayLength];

        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter elements for the String Array:");
        for (int i = 0; i < stringArrayLength; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            product[i] = scanner.nextLine();
        }

        // Test version 1.0 - Print entire arrays
        printArray(grades);
        printArray(product);

        // Test version 2.0 - Print arrays starting from a specified index
        System.out.print("Enter the start index for the double array: ");
        int startIndexDouble = scanner.nextInt();
        printArray(grades, startIndexDouble);

        System.out.print("Enter the start index for the string array: ");
        int startIndexString = scanner.nextInt();
        printArray(product, startIndexString);

        // Test version 3.0 - Print arrays within a specified range of indices
        System.out.print("Enter the start index for the double array: ");
        int startIndexDoubleV3 = scanner.nextInt();
        System.out.print("Enter the end index for the double array: ");
        int endIndexDoubleV3 = scanner.nextInt();
        printArray(grades, startIndexDoubleV3, endIndexDoubleV3);

        System.out.print("Enter the start index for the string array: ");
        int startIndexStringV3 = scanner.nextInt();
        System.out.print("Enter the end index for the string array: ");
        int endIndexStringV3 = scanner.nextInt();
        printArray(product, startIndexStringV3, endIndexStringV3);

        scanner.close();
    }
}