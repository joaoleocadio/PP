package BikeStore;

import enums.BrakeType;
import static enums.BrakeType.HIDRAULICOS;
import enums.Material;
import static enums.Material.CARBONO;

public class RoadBike extends Bicicleta{
    
    private final int MAXOBS = 20;
    
    private String fitasGuiador;
    private float tamanhoQuadro;
    private String[] observacao = new String[MAXOBS];
    
    private int countObs = 0;
    
    public RoadBike(int id, int numVelocidades, String cor, double diametroRoda, BrakeType travoes, Material material, double preco, int garantia) {
        super(id, numVelocidades, cor, diametroRoda, HIDRAULICOS, CARBONO, preco, garantia);
        
        this.fitasGuiador = fitasGuiador;
        this.tamanhoQuadro = tamanhoQuadro;
    }
    
    public void addObs(String obs){
        
        if(countObs < MAXOBS){
            observacao[countObs] = obs;
            countObs+=1;
        }else{
            System.out.println("Limite máximo!");
        }        
    }
    
    public void removerObs(int pos){
        String[] tmp = new String[MAXOBS];
        int found = 0;

        for (int i = 0; i < countObs; i++) {
            if (pos == i) {
                found += 1;
                countObs -= 1;
                tmp[i] = null;
                continue;
            }
            
            tmp[i] = observacao[i];
        }

        if (found > 0) {
            observacao = tmp;
        } else {
            System.out.println("Não foi encontrado.");
        }
    }
    
    public String printobs() {
        String obs = "";
        
        for (int i = 0; i < countObs; i++) {
            if(observacao[i] != null){
                obs += "Observação " + (i + 1) + ": " + observacao[i] + "\n";
            }         
        }
        return obs;
    }
    
    public void infoBike(){
        System.out.println("Id: " + getId());
        System.out.println("Preço: " + getPreco());
        System.out.println("----------Observações----------- ");
        System.out.println(printobs());
    }
}
