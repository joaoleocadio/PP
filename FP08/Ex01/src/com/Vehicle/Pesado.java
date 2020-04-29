package com.Vehicle;

import enums.Condicao;
import enums.Origem;
import enums.Tipologia;

public class Pesado extends Veiculo{
    private double comprimento;
    private int carga;
    private Tipologia tipo;
    private boolean atrelado;

    public Pesado(int id, String marca, Origem origem, int numKMS, Condicao condicao, double preco, boolean atrelado) {
        super(id, marca, origem, numKMS, condicao, preco);
        this.atrelado = atrelado;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isAtrelado() {
        return atrelado;
    }

    public void setAtrelado(boolean atrelado) {
        this.atrelado = atrelado;
    }

    public double Preco(){
        double novoPreco, desconto = 0;

        if (isAtrelado() == true && getCondicao() == Condicao.NOVO){
            desconto = this.getPreco() * 0.05;
            novoPreco = this.getPreco() - desconto;
        }
        else if (isAtrelado() == false && getCondicao() == Condicao.NOVO){
            novoPreco = this.getPreco();
        }
        else {
            desconto = this.getPreco() * 0.15;
            novoPreco = this.getPreco() - desconto;
        }
        return novoPreco;
    }

    public String toString() {
        String text = "ID: " + super.getId() + "\n"
                + "Marca: " + super.getMarca() + "\n"
                + "Nº Kms: " + super.getNumKMS() + "\n"
                + "Origem: " + super.getOrigem() + "\n"
                + "Atrelado: " + isAtrelado() + "\n"
                + "Preço: " + Preco() + "\n";
        return text;
    }
}
