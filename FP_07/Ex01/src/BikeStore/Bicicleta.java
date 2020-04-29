package BikeStore;

import enums.BrakeType;
import enums.Material;

public class Bicicleta {
    
    private int id;
    private int numVelocidades;
    private String cor;
    private double diametroRoda;
    private BrakeType travoes;
    private Material material;
    private double preco;
    private int garantia;

    public Bicicleta(int id, int numVelocidades, String cor, double diametroRoda, BrakeType travoes, Material material, double preco, int garantia) {
        this.id = id;
        this.numVelocidades = numVelocidades;
        this.cor = cor;
        this.diametroRoda = diametroRoda;
        this.travoes = travoes;
        this.material = material;
        this.preco = preco;
        this.garantia = garantia;
    }

    public int getId() {
        return id;
    }

    public int getNumVelocidades() {
        return numVelocidades;
    }

    public String getCor() {
        return cor;
    }

    public double getDiametroRoda() {
        return diametroRoda;
    }

    public BrakeType getTravoes() {
        return travoes;
    }

    public Material getMaterial() {
        return material;
    }

    public double getPreco() {
        return preco;
    }

    public int getGarantia() {
        return garantia;
    }
    
    
    
}
