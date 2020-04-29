
package BikeStore;

import enums.BrakeType;
import static enums.BrakeType.PINÇAS;
import enums.Material;
import static enums.Material.CARBONO;
import enums.Suspensao;
import enums.Utensilios;

/**
 *
 * @author Utilizador
 */
public class Ex01 {

    public static void main(String[] args) {
        
        MountainBike mb1 = new MountainBike(2, Suspensao.DUPLA, 1, 5, "Verde", 0.56, PINÇAS, CARBONO, 712.69, 2);
        
        RoadBike rd1 = new RoadBike(1, 5, "Azul", 0.69, PINÇAS, CARBONO, 120.99, 2);
        
        rd1.addObs("primeira observação");
        rd1.addObs("segunda observação");
        rd1.addObs("terceira observação");
        rd1.addObs("quarta observação");
        rd1.removerObs(1);
        rd1.removerObs(3);
        rd1.addObs("segunda observação");
        rd1.removerObs(3);
        rd1.infoBike();
        /*mb1.addTool(Utensilios.ALFORJE);
        mb1.infoBike();
        mb1.removerTool(Utensilios.ALFORJE);
        mb1.infoBike();*/
        
        
    }
    
}
