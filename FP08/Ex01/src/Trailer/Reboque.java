package Trailer;

import enums.TrailerType;

public class Reboque extends Trailler{
    private TrailerType trailerType;

    public Reboque(int numEixos, int capacidade, TrailerType trailerType) {
        super(numEixos, capacidade);
        this.trailerType = trailerType;
    }
}
