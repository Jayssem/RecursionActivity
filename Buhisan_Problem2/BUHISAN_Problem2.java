/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buhisan_problem2;

import java.util.Scanner;

/**
 *
 * @author BUHISAN_CPE113
 */
public class BUHISAN_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Gina ignore niya ang parentheses, comma ug spaces.
        input.useDelimiter("[^0-9-]+");

        // Allows you to input 2 numbers a, and b.
        int a = input.nextInt();
        int b = input.nextInt();

        int result = gcd(a, b);

        // Iyang e print after niya e validate.
        if (a < 0 || b < 0) {
            System.out.print("Mali usaba");

        } else if (a == 0 && b == 0) {
            System.out.println("Undefined, dapat naay values greater than 0()");

        } else {
            System.out.println(result);
        }
        input.close();
    }

    // Computes GCD recursively.
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}