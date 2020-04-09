
package pp_fp06.pizza_restautant;

import pp_fp06.pizza_restaurant.enums.Origem;
import pp_fp06.pizza_restaurant.enums.Tamanho;

/**
 *
 * @author Utilizador
 */
public class Restaurante {

    public static void main(String[] args) {
        Ingrediente[] lista1 = {new Ingrediente(3, "Tomate", Origem.VEGETAL),
                                new Ingrediente(2, "Cebola", Origem.VEGETAL),
                                new Ingrediente(1, "Queijo", Origem.ANIMAL)};
        
        Pizza pizza1 = new Pizza(3906, "Carbonara", "pizza levesad fbdbfdsvdsd", 2, lista1, Tamanho.MÉDIA);
        Pizza pizza2 = new Pizza(3, "Pizza da Casa", "sadasddbf,", 6, lista1, Tamanho.MÉDIA);
        

       /* pizza1.removerIngrediente(2);
        pizza1.removerIngrediente(1);
        pizza1.removerIngrediente(3);
        pizza1.imprimirPizza();*/
       
       pizza2.imprimirPizza();
    }
    
}
