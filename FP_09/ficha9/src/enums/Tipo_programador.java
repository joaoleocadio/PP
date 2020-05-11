package enums;

public enum Tipo_programador {
    JUNIOR, SENIOR;
    
    public static String Tipo_programador(Tipo_programador tipo){
        switch (tipo){
            case JUNIOR:
                return "Programador Júnior";
            case SENIOR:
                return "Programador Sénior";
            default:
                return "Erro!";
        }
    }
}
