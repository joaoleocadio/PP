package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author Utilizador
 */
public enum Origem {
    ANIMAL, VEGETAL, MINERAL;
    
    public static String Origem(Origem origem){
        switch(origem){
            case ANIMAL:
                return "Origem Animal";
            case VEGETAL:
                return "Origem Vegetal";
            case MINERAL:
                return "Origem Mineral";
            default:
                return "Origem Inválida!";
        }   
    }
}
