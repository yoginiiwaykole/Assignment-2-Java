# Assignment-2-Java

Array to ArrayList:
Description
This Java program creates an ArrayList of strings with the names P, Q, R, S, and T, and prints it to the console. It then adds the strings A, B, and C to the ArrayList, and prints the updated ArrayList to the console. Finally, it creates an array of strings from the first five elements of the ArrayList, and prints the array to the console.

How to Run
To run this program, you need to have Java installed on your system. Follow these steps:
Copy the code to a file named "Mainnn.java".
Open a command prompt or terminal window and navigate to the directory where the file is saved.
Compile the program by typing "javac Mainnn.java" and pressing Enter.
Run the program by typing "java Mainnn" and pressing Enter.

Original ArrayList : 
P Q R S T 
New ArrayList : 
P Q R S T A B C 
Array : 
P Q R S T 





Program to separate even and odd numbers in an array
This Java program prompts the user to enter the number of elements to be entered in the array. It then initializes two arrays, even and odd, with the given number of elements. The program then prompts the user to enter n numbers and fills the even and odd arrays accordingly.

Finally, the program prints out the even and odd numbers in separate lines.

fillArrays() method
This method takes four parameters - the even array, the odd array, the number of elements to be entered, and the scanner object. It prompts the user to enter n numbers and fills the even and odd arrays accordingly.

printArray() method
This method takes an array and its length as input and prints the array. Here, it is used to print the even and odd arrays.

countEven() and countOdd() methods
These methods take an array as input and count the number of even and odd numbers in the array, respectively.





This Java program finds the index of the two nearest neighbors in an integer array. Here's a brief explanation of the code:

The program defines a method called findNearestNeighbors, which takes an integer array as input and returns the index of the first number in the array that has the smallest absolute difference with its neighbor.

The method initializes two integer variables minDiff and index to store the minimum absolute difference and the index of the corresponding number in the array, respectively.

The method then iterates over the array using a for loop starting from the second element (i.e., index 1) and calculates the absolute difference between each element and its previous element using the Math.abs method.

If the absolute difference is smaller than the current minimum difference, the program updates the minDiff and index variables accordingly.

Once the loop finishes, the program returns the index of the first number with the smallest absolute difference with its neighbor.
