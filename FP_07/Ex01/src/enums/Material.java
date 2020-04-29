package enums;

public enum Material {
    CARBONO, ALUMINIO;
    
    public static String Material(Material material){
        switch(material){
            case CARBONO:
                return "Fabricado em Carbono";
            case ALUMINIO:
                return "Fabricado em Aluminio";
            default: 
                return "Material não encontrado";
        }
    }
}
