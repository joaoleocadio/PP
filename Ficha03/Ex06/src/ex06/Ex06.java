
package ex06;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Ex06 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner(System.in);
        int euro;
        double cent;
        
        System.out.println("Introduza valor: ");
        int valor = sc.nextInt();
        euro = (int) valor / 100;
        cent = valor % 100;
        
        System.out.printf("%d euros e %.1f centimos", euro, cent);*/
        
        double Input = Double.parseDouble(args[0]);
        double valor, valor1, valor2;
        
        valor = Input / 100;
        valor1 = (int) valor;
        valor2 = Input % 100;
        
        System.out.print(valor1);
        System.out.print(" euros e ");
        System.out.print(valor2);
        System.out.print(" centimos ");
    }
    
}
