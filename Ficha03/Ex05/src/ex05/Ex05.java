package ex05;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double cambioDolar = 0.90;
        double cambioEuro = 1.11;
        double valor2;

        System.out.println("Introduza a moeda (E)-euro ou (D)-dolar ");
        String moeda = sc.nextLine();
        System.out.println("Introduza o valor: ");
        double valor = sc.nextDouble();
        
        
        if("e".equals(moeda)){
            valor2 = valor * cambioEuro;
            System.out.println("Euros: " + valor2);
        
        }else if ("d".equals(moeda)){
            valor2 = valor * cambioDolar;
            System.out.println("Dólar: " + valor2);
        }else{
            System.out.println("Moeda Inválida! ");
        }

    }
    
}
