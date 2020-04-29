package com.Vehicle;

import enums.Condicao;
import enums.Origem;

public class Motociclo extends Veiculo{
    private int cilindrada;
    private float diametroRodas;

    public Motociclo(int id, String marca, Origem origem, int numKMS, Condicao condicao, double preco, int cilindrada) {
        super(id, marca, origem, numKMS, condicao, preco);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        String text = "ID: " + super.getId() + "\n"
                + "Marca: " + super.getMarca() + "\n"
                + "Nº Kms: " + super.getNumKMS() + "\n"
                + "Origem: " + super.getOrigem() + "\n"
                + "Cilindrada: " + getCilindrada() + "\n"
                + "Preço: " + super.getPreco() + "\n";
        return text;
    }
}
