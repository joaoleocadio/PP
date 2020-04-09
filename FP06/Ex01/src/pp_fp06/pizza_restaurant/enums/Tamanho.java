package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author Utilizador
 */
public enum Tamanho {
    
    PEQUENA, MÉDIA, FAMILIAR;
    
    public static String Tamanho(Tamanho tamanho){
        switch(tamanho){
            case PEQUENA:
                return "Pizza pequena";
            case MÉDIA:
                return "Pizza média";
            case FAMILIAR:
                return "Pizza Familiar";
            default:
                return "Tamanho inválido";
        }   
    }
}
