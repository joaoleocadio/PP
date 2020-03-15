package ex03;

public class Ex03 {

    public static void main(String[] args) {
        int[][] vetor = {
            {1, 1, 333},
            {-20, -23, 63},
            {1, 501, 10000},
            {-22, 1, -22}
        };
        
        int[][] repetidos = new int[vetor.length][vetor[0].length];
        int coluna = 0;
        int linha = 0;
        int maior = 0;
        int menor = 0;
        int maisRepetido = 0;
        
        //Imprimir a matriz
        for (int i = 0; i < vetor.length; i++){
            System.out.println("");
            for (int j = 0; j < vetor[i].length; j++){
                System.out.print(vetor[i][j] + " ");
            }
        }
        
        for (int i = 0; i < vetor.length; i++){
            for (int j= 0; j < vetor[i].length; j++){
                
                for (int k = 0; k < vetor.length; k++){
                    for (int l = 0; l < vetor[k].length; l++){
                        if (vetor[i][j] == vetor[k][l]){
                            ++repetidos[i][j];
                        }
                    }
                }
            }
        }
        
        System.out.println("");
        for (int i = 0; i < vetor.length; i++){
            maior = vetor[i][0];
            menor = vetor[i][0];
            for(int j = 0; j < vetor[i].length; j++){
                if(vetor[i][j] > maior){
                    maior = vetor[i][j];
                }
                if(vetor[i][j] < menor){
                    menor = vetor[i][j];
                }
                if(repetidos[i][j] > maisRepetido){
                    maisRepetido = repetidos[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            System.out.println("Linha " + i);
            System.out.println("Maior : " + maior);
            System.out.println("Menor : " + menor);
            System.out.println(" ");
            
        }
        System.out.println("Mais Repetido : " + vetor[linha][coluna]);
    }
    
}
