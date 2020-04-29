package BikeStore;

import enums.BrakeType;
import enums.Material;
import enums.Suspensao;
import enums.Utensilios;


public class MountainBike extends Bicicleta{
    
    private final int MAXTOOLS = 5;
    int countTools = 0;
    
    private int numLuzes;
    private Suspensao suspensao;
    private Utensilios[] utensilios;

    public MountainBike(int numLuzes, Suspensao suspensao, int id, int numVelocidades, String cor, double diametroRoda, BrakeType travoes, Material material, double preco, int garantia) {
        super(id, numVelocidades, cor, diametroRoda, travoes, material, preco, garantia);
        this.numLuzes = numLuzes;
        this.suspensao = suspensao;
        utensilios = new Utensilios[MAXTOOLS];
    }

    public int getMAXTOOLS() {
        return MAXTOOLS;
    }

    public int getNumLuzes() {
        return numLuzes;
    }

    public Suspensao getSuspensao() {
        return suspensao;
    }
    
    public void addTool(Utensilios newTool){
        
        for(int i = 0; i < MAXTOOLS; i++){
            if(utensilios[i] == null){
                utensilios[i] = newTool;
                countTools++;
                break;
            }
        }
    }
    
    public void removerTool(Utensilios tool){
        
        for(int i = 0; i < countTools; i++){
            if(utensilios[i] == tool){
                for(int j = -1; j < countTools - 1; j++){
                    utensilios[i] = utensilios[i + 1];
                    countTools--;
                }
            }             
        }    
    }
    
    public String printtools() {

        String tools = "";
        
        for (int i = 0; i < countTools; i++) {
            tools += utensilios[i] + "\n";
        }

        return tools;
    }
    
    public void infoBike(){
        System.out.println("Id: " + getId());
        System.out.println("Número de Luzes: " + getNumLuzes());
        System.out.println("Tipo de Suspensão: " + getSuspensao());
        System.out.println("Preço: " + getPreco());
        System.out.println("----------tools--------- ");
        System.out.println(printtools());
    }
    
    

    
    
}
