package enums;

public enum Tipologia {
    TRUCK, TIR;

    public static String Tipologia(Tipologia tipologia){
        switch (tipologia){
            case TIR:
                return "Camiao TIR";
            case TRUCK:
                return "Truck";
            default:
                return "Tipologia invalida";
        }
    }
}
