/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buhisan_problem1;

/**
 *
 * @author BUHISAN_CPE113
 */
public class BUHISAN_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 9;
        int total = SumDig(number);
        System.out.println("The Sum of " + number + " is " + total);
    }

    public static int SumDig(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + SumDig(n / 10);
        }
    }
}
