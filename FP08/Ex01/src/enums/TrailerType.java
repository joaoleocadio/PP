package enums;

public enum TrailerType {
    BASCULANTE, ABERTO, FECHADO, FRIGORIFICO;

    public static String TrailerType(TrailerType trailerType){
        switch (trailerType){
            case BASCULANTE:
                return "Basculante";
            case ABERTO:
                return "Aberto";
            case FECHADO:
                return "Fechado";
            case FRIGORIFICO:
                return "Frigorifico";
            default:
                return "Trailer Type Inválido!";
        }

    }
}
