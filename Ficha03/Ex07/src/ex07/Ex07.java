
package ex07;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Ex07 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int q, r = 0; //quociente e resto
        
        System.out.println("Insira o Dividendo: ");
        int Dividendo = sc.nextInt();
        System.out.println("Insira divisor: ");
        int divisor = sc.nextInt();
        
        
        //D = d * q + r
        q = (Dividendo - r) / divisor;
        r = Dividendo - (divisor * q);
        
        System.out.println("quociente: " + q);
        System.out.println("Resto " + r);
        
        
    }
    
}
