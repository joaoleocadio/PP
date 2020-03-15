package ex2;

/**
 *
 * @author Utilizador
 */
public class Ex2 {

    public static void main(String[] args) {
        //Exercicio 2
        int [] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,28};
        
        int numero = 0;
        
        for(int i = 0; i < vetor.length; i++){
            numero = vetor[i];
            int contador = 0;
            for(int x = 1; x <= numero; x++){
                if(numero % x == 0){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.println("O número " + vetor[i] + " é primo");
            }else{
                System.out.println("O número " + vetor[i] + " não é primo");
            }   
        }
        System.out.println("");
        
        /*é um número natural para o qual a soma de todos os seus divisores 
        naturais próprios é igual ao próprio número*/
        
        for (int i = 0; i < vetor.length; i++) {
            int a = 0;
            for (int j = 1; j < vetor[i]; j++) {
                // soma dos divisores
                if (vetor[i] % j == 0) {
                    a += j;
                }
            }
            // se a soma dos divisore for igual ao proprio numero
            if (a == vetor[i]) {
                System.out.println(vetor[i] + " é número perfeito");
            }
        }
    }
    
}
