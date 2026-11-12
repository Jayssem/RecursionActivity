/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buhisan_problem3;

import java.util.Scanner;

/**
 *
 * @author BUHISAN_CPE113
 */
public class BUHISAN_Problem3 {

    /**
     * @param args the command line arguments
     */
    // Method 1: Array Sum.
    public static int arraySum(int[] values, int index) {

        // pag ma abot na sya sa set limit mu stop sya.
        if (index == values.length) {
            return 0;
        }

        // e add niya ang element sa remainder.
        return values[index] + arraySum(values, index + 1);
    }

    // Method 2: Find the maximum.
    public static int findMaximum(int[] values, int index) {

        // Base case: mao ni ang last valid index.
        if (index == values.length - 1) {
            return values[index];
        }

        // Recursive case: pangitaon ang maximum remaining elements.
        int maximumOfRest = findMaximum(values, index + 1);

        // Compare ang current element sa uban maximum element.
        if (values[index] > maximumOfRest) {
            return values[index];
        } else {
            return maximumOfRest;
        }
    }

    // Method 3: Count the even elements.
    public static int countEven(int[] values, int index) {

        // Base case: pag ma abot na sya sa set limit mu stop sya.
        if (index == values.length) {
            return 0;
        }

        // e check kung even na ba ang elements.
        int currentCount = 0;

        if (values[index] % 2 == 0) {
            currentCount = 1;
        }

        // Recursive case: e count ang remaining even elements.
        return currentCount + countEven(values, index + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int size = input.nextInt();

        // Validate array size
        if (size <= 0) {
            System.out.println("Invalid array size! Enter at least one element.");
        } else {

            int[] values = new int[size];

            // Read array elements
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                values[i] = input.nextInt();
            }

            // Mao nani ang recursion.
            int sum = arraySum(values, 0);
            int maximum = findMaximum(values, 0);
            int evenCount = countEven(values, 0);

            // Display results in main()
            System.out.println("\nArray Analysis Results:");
            System.out.println("Array Sum: " + sum);
            System.out.println("Largest Element: " + maximum);
            System.out.println("Number of Even Elements: " + evenCount);
        }

        input.close();
    }
}
