/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buhisan_problem1;

import java.util.Scanner;

/**
 *
 * @author BUHISAN_CPE113
 */
public class BUHISAN_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Mali Usaba");
        } else {
            System.out.println(sumOfDigits(number));
        }
    }
}
