package enums;

public enum BrakeType {
    PINÇAS, HIDRAULICOS;
    
    public static String BrakeType(BrakeType tipo){
        switch(tipo){
            case PINÇAS:
                return "Travões a pinças";
            case HIDRAULICOS:
                return "Travões hidraulicos";
            default:
                return "Travões Invádlidos";
        }
    }
}
