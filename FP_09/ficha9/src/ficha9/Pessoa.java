package ficha9;

import java.util.Date;

/**
 *
 * @author Utilizador
 */
abstract class Pessoa {
    private String nome;
    private String dataNasc;
    private String morada;
    private int numCC;
    private int nIF;
    private double salario;

    public Pessoa(String nome, String dataNasc, int nIF, double salario) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.nIF = nIF;
        this.salario = salario;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNumCC() {
        return numCC;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }

    public int getnIF() {
        return nIF;
    }

    public void setnIF(int nIF) {
        this.nIF = nIF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public String toString() {
        String text = "Nome : " + nome + "\n"
                + "Data de nascimento : " + dataNasc + "\n"
                + "Morada : " + morada + "\n"
                + "Número cartão de cidadão : " + numCC + "\n"
                + "NIF : " + nIF + "\n"
                + "Salário base : " + calcularSalario()+ "\n";
        return text;
    }
    
    abstract double calcularSalario();
    
}
