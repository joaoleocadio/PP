package enums;

import javax.management.Query;

public enum Origem {
    NACIONAL, IMPORTADO;

    public static String Origem(Origem origem){
        switch (origem){
            case NACIONAL:
                return "Origem Nacional";
            case IMPORTADO:
                return "Origem Importado";
            default:
                return "Origem Inválida";
        }
    }
}
