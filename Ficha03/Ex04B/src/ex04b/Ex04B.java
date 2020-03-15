
package ex04b;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Ex04B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduza graus: ");
        double graus = sc.nextDouble();
        double rad = graus * Math.PI / 180;
        
        System.out.printf("Radianos: %.2f", rad);
    }
    
}
