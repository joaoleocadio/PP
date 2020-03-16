
package ex08;

/**
 *
 * @author Utilizador
 */
public class Ex08 {

    public static void main(String[] args) {
        
        double dinheiro = Double.parseDouble(args[0]);
        int moeda2 = 0;
        int moeda1 = 0;
        int moeda50 = 0;
        
        while(dinheiro != 0){
            
            if(dinheiro >= 2){
                dinheiro -= 2;
                moeda2 += 1;
            }
            else if (dinheiro >= 1){
                dinheiro -= 1;
                moeda1 += 1;
            }
            else if (dinheiro >= 0.5){
                dinheiro -= 0.5;
                moeda50 += 1;
            }
        }
        
        System.out.println(" Moedas de 2 Euro : " + moeda2);
        System.out.println(" Moedas de 1 Euro : " + moeda1);
        System.out.println(" Moedas de 50 centimos : " + moeda50);
        
    }
    
}
