package com.Vehicle;

import enums.Condicao;
import enums.Origem;

public class Veiculo {
    private int id;
    private int numChassis;
    private String marca;
    private String modelo;
    private String dataFab;
    private Origem origem;
    private int numKMS;
    private Condicao condicao;
    private double preco;

    private final int MAXAUTO = 20;
    private Veiculo[] autoList = new Veiculo[MAXAUTO];
    int count = 0;


    public Veiculo( int id, String marca, Origem origem, int numKMS, Condicao condicao, double preco) {
        this.id = id;
        this.marca = marca;
        this.origem = origem;
        this.numKMS = numKMS;
        this.condicao = condicao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumChassis() {
        return numChassis;
    }

    public void setNumChassis(int numChassis) {
        this.numChassis = numChassis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDataFab() {
        return dataFab;
    }

    public void setDataFab(String dataFab) {
        this.dataFab = dataFab;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public int getNumKMS() {
        return numKMS;
    }

    public void setNumKMS(int numKMS) {
        this.numKMS = numKMS;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        String text = "ID: " + id + "\n"
                    + "Marca: " + marca + "\n"
                    + "Nº Kms: " + numKMS + "\n"
                    + "Origem: " + origem + "\n"
                    + "Preço: " + preco + "\n";
        return text;
    }

}
