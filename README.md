## Assignment Description ##

This assignment demonstrates the use of generics and collections in Java through four distinct classes. The ArrayPrinter class shows how to create generic methods for array operations. The DataQueue and DataQueueTest classes illustrate a generic queue implementation and its usage. The WordTypeCount class uses a HashMap to count word occurrences in a string, showcasing collection operations. These examples highlight key concepts in Java programming and provide a solid foundation for understanding generics and collections.

## 1. ArrayPrinter.java
The ArrayPrinter class contains generic methods for printing arrays. It includes three overloaded methods:

printArray(T[] inputArray): Prints the entire array.
printArray(T[] inputArray, int startIndex): Prints the array starting from a specified index.
printArray(T[] inputArray, int startIndex, int endIndex): Prints the array within a specified range of indices.

Double[] grades = {95.5, 85.0, 77.3};
String[] products = {"Apple", "Banana", "Orange"};

ArrayPrinter.printArray(grades); // Prints the entire double array
ArrayPrinter.printArray(products); // Prints the entire string array

ArrayPrinter.printArray(grades, 1); // Prints the double array from index 1
ArrayPrinter.printArray(products, 2); // Prints the string array from index 2

ArrayPrinter.printArray(grades, 0, 2); // Prints the double array from index 0 to 2
ArrayPrinter.printArray(products, 1, 3); // Prints the string array from index 1 to 3

## 2. DataQueue.java
The DataQueue class implements a generic queue using a linked list. It includes methods for:

enqueue(E item): Adding an element to the queue.
dequeue(): Removing an element from the queue.
isEmpty(): Checking if the queue is empty.
printQueue(): Printing the elements of the queue.

DataQueue<String> queue = new DataQueue<>();
queue.enqueue("First");
queue.enqueue("Second");
queue.enqueue("Third");

queue.printQueue(); // Prints the queue

queue.dequeue(); // Removes "First"
queue.printQueue(); // Prints the queue after dequeue


## 3. DataQueueTest.java
The DataQueueTest class tests the functionality of the DataQueue class with different data types, including String and a custom ModifiedStock class. It demonstrates how to use the queue operations and prints the results.

Example Usage
Run the DataQueueTest main method to see the output of queue operations with String and ModifiedStock objects.

## 4. WordTypeCount.java
The WordTypeCount class counts the occurrences of each word in a user-provided string using a HashMap. It then prints the word counts and identifies words with the minimum number of repeats.

// Input: "this is a test this is only a test"
Map<String, Integer> wordCountMap = WordTypeCount.countWords("this is a test this is only a test");
