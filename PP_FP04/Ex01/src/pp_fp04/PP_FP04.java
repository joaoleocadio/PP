package pp_fp04;

import java.util.Arrays;
import static pp_fp04.User.despesa;

public class PP_FP04 {

    static User user1;
    
    public static void main(String[] args) {
        user1.id[0] = 'A';
        user1.id[0] = 'B';
        user1.id[0] = 'C';
        user1.name = new char[]{'B','r','u','n','o'};
        user1.email = new char[]{'b','m','o','@','e','s','t','f','.',
                                'i','p','p','.','p','t'};
        
        double somaCarro = 0, somaComida = 0;
        double nCarro = 0, nComida = 0;
        
        
        
        System.out.println("----------User1-----------");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        
        user1.despesa.carValues[0] = 50.99;
        user1.despesa.carValues[1] = 100.99;
        user1.despesa.carValues[2] = 140.99;
        user1.despesa.carValues[3] = 125.99;
        user1.despesa.number1 = 4;
        System.out.println("--------Despesas automoveis---------");
        System.out.print("Car description: ");
        System.out.println(despesa.descriptionCar);
        System.out.print("Car values: ");
        System.out.println(Arrays.toString(user1.despesa.carValues));
        
        System.out.println("--------Despesas alimentares---------");
        user1.despesa.foodValues[0] = 100.99;
        user1.despesa.foodValues[1] = 20;
        user1.despesa.foodValues[2] = 30;
        user1.despesa.foodValues[3] = 40;
        user1.despesa.number2 = 4;
        System.out.print("Food description: ");
        System.out.println(Expenses.descriptionFood);
        System.out.print("Food values: ");
        System.out.println(Arrays.toString(user1.despesa.foodValues));
        
        for (int i = 0; i < user1.despesa.carValues.length; i++){
            if(user1.despesa.carValues[i]  != 0){
                somaCarro += user1.despesa.carValues[i];
                ++nCarro;
            }       
        }
        
        for (int i = 0; i < user1.despesa.foodValues.length; i++){
            if(user1.despesa.carValues[i]  != 0){
                somaComida += user1.despesa.foodValues[i];
                ++nComida;
            }       
        }
        
        System.out.printf("Despesa carro: %.2f\n" ,somaCarro);
        System.out.printf("Despesa comida: %.2f\n" ,somaComida);
        System.out.println("Valor total dispendido: " + (somaCarro + somaComida));
        System.out.printf("Valor médio de gastos com o carro: %.2f\n" ,(somaCarro / nCarro));
        System.out.printf("Valor médio de gastos com a comida: %.2f\n" ,(somaComida / nComida));
        

        /**Ex 2.4
         * 
         * Impossível aceder às variáveis da classe. O modificador private nao permite acesso
         */
    }
    
}
