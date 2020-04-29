package Trailer;

public class SemiReboque extends Trailler {
    private int pneusSobress;

    public SemiReboque(int numEixos, int capacidade, int pneusSobress) {
        super(numEixos, capacidade);
        this.pneusSobress = pneusSobress;
    }
}
