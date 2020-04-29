package enums;

public enum Condicao {
    NOVO, USADO;

    public static String Condicao(Condicao condicao){
        switch (condicao){
            case NOVO:
                return "Carro novo";
            case USADO:
                return "Carro usado";
            default:
                return "Condicao inválida!";
        }
    }
}
