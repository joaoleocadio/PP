package com.Vehicle;

import enums.Condicao;
import enums.Origem;

public class Automovel extends Veiculo {

    private int numOcupantes;
    private int numPortas;

    public Automovel(int id, String marca, Origem origem, int numKMS, Condicao condicao, double preco, int numOcupantes, int numPortas) {
        super(id, marca, origem, numKMS, condicao, preco);
        this.numOcupantes = numOcupantes;
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public double Preco(){
        double novoPreco, desconto = 0;

        if (getCondicao() == Condicao.NOVO){
            novoPreco = this.getPreco();
        }
        else {
            desconto = this.getPreco() * 0.3;
            novoPreco = this.getPreco() - desconto;
        }
        return novoPreco;
    }

    public String toString() {
        String text = "ID: " + super.getId() + "\n"
                + "Marca: " + super.getMarca() + "\n"
                + "Nº Kms: " + super.getNumKMS() + "\n"
                + "Nº Portas: " + getNumPortas() + "\n"
                + "Origem: " + super.getOrigem() + "\n"
                + "Preço: " + Preco() + "\n";
        return text;
    }
}
