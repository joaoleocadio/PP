package ex01;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int [][] matrizA = {
            {1,2,3,},
            {4,5,6},
            {7,8,9}
        };*/
        int[][] matriz = new int[3][3];
        int[][] matrizB = new int[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; ++j){
                System.out.printf("Introduza o elemento [%d][%d] da matriz A\n", i,j);
                matriz[i][j] = sc.nextInt();             
            }
        }
        sc.close();
        
        //Imprimir a matriz inserida pelo user
        for(int i = 0; i < 3; i++){
            System.out.println("");
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + "\t");
            }
        }
        
        //atribuir a matriz inserida à matriz b
        for(int i = 0; i < 3; i++){
            System.out.println("");
            for(int j = 0; j < 3; j++){
                matrizB[i][j] = matriz[j][i];                                                
            }
        }
        
        //impressão da matriz transposta
        for(int i = 0; i < 3; i++){
            System.out.println("");
            for(int j = 0; j < 3; j++){
                System.out.print(matrizB[i][j] + "\t");                                              
            }
        } 
    }
    
}
