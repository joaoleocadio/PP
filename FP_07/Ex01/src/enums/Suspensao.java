package enums;

public enum Suspensao {
    SIMPLES, DUPLA, SEMSUSPENSAO;
    
    public static String Suspensao(Suspensao suspensao){
        switch(suspensao){
            case SIMPLES:
                return "Suspensão Simples";
            case DUPLA:
                return "Suspensão Dupla";
            case SEMSUSPENSAO:
                return "Sem Suspensao";
            default:
                return "Suspensao Inválida";
        }
    }
}
