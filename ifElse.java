/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author AndreaCardenasT
 */
import java.util.Scanner;
public class ifElse {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int numba1 = scanner.nextInt();
        
        System.out.print("Enter a second integer number: ");
        int numba2 = scanner.nextInt();
        
        if (numba1 < numba2) {
            System.out.print("The variable numba1 is smaller than numba2");
            
        } else {
            System.out.print("The variable numba1 is greater than numba2");
        }
    }
}
