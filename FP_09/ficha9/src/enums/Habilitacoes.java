package enums;

public enum Habilitacoes {
    LICENCIATURA, MESTRADO, DOUTORAMENTO;
    
    public static String Habilitacoes(Habilitacoes habilitacoes){
        switch (habilitacoes){
            case LICENCIATURA:
                return "Licenciado";
            case MESTRADO:
                return "Mestrado";
            case DOUTORAMENTO:
                return "Doutoramento";
            default:
                return "Habilitações Inválidas";
        }
    }
}
