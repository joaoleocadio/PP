
package enums;

public enum tipoContrato {
    PARCIAL, INTEGRAL;
    
    public static String tipoContrato(tipoContrato contrato){
        switch (contrato){
            case INTEGRAL:
                return "Contrato Integral";
            case PARCIAL:
                return "Contrato parcial";
            default:
                return "Contrato inválido";
        }
    }
}
