package pp_fp02;

/**
 *
 * @author Utilizador
 */
public class PP_FP02 {

    public static void main(String[] args) {

        /*char[] sentence = {'e','u',' ',
                            's','o','u',' ',
                            'a','l','u','n','o',' ',
                            'd','a',' ',
                            'E','S','T','G','F','.','\n'};
        
        for (int i = 0; i < sentence.length; i++) {
            System.out.print(sentence[i]);
        }
        
        //Exercício 2
        int [][] matriz = new int[3][3];
        int soma = 0;
        double media = 0d;
        matriz[0][0] = 11;
        matriz[0][1] = 7;
        matriz[0][2] = 333;
        matriz[1][0] = -20;
        matriz[1][1] = -23;
        matriz[1][2] = 63;
        matriz[2][0] = -22;
        matriz[2][1] = 501;
        matriz[2][2] = 10000;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                soma += matriz[i][j];              
            }    
        } 
        media = soma / 9.0;
        System.out.println("Soma" + soma);
        System.out.printf("Média: %.2f\n" , media);
        
        //Exercicio 3
        int [] lista ={12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int produto = 1;
        int negativo = 0;
        int maior = 0;
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i] > maior){
                produto *= lista[i];
                maior = lista[i];
            }else{
                ++negativo;
            }            
        }
        System.out.println("Multiplicação positivos: " + produto);
        System.out.println("Nºs Negativos: " + negativo);
        System.out.println("Nº Maior: " + maior);
        
        //Exercicio 4
        char[] nome = {'A', 'n', 'a', ' ', 'S','a','n','t','o','s'};
        int vogais = 0, consoantes = 0;
        
        for(int i = 4; i < nome.length; ++i){
            System.out.print(nome[i]);
        }
        System.out.print(",");
        for(int i = 0; i < nome.length - 7; ++i){
            System.out.print(nome[i]);
        }
        System.out.println("");
        for(int i = 0; i < nome.length; ++i){
            if(nome[i] == 'A' || nome[i] == 'a' || nome[i] =='o'){
                ++vogais;
            }else if(nome[i] == 'n' || nome[i] == 'S' || nome[i] == 't' || nome[i]== 's'){
                ++consoantes;
            }
        }
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);*/
        
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 69, -1, 12, 1, -2};
        int cont = 0;
        //Unir os dois vetores num novo
        int[] listaNova = new int[listaA.length + listaB.length];
            System.arraycopy(listaA, 0, listaNova,0, listaA.length);
            System.arraycopy(listaB, 0, listaNova, listaA.length, listaB.length);
           
             
        for(int i = 0; i < listaNova.length; i++){
            for(int j = i + 1; j < listaNova.length; j++){
                if(listaNova[i] == listaNova[j] && i != j){
                    ++cont;
                }
            }
            System.out.print(listaNova[i] + ",");    
        }
        System.out.println("");   
        System.out.println("Valores duplicados: " + cont);
        
    }
}
