package ficha9;

import enums.Tipo_programador;
import java.util.Date;

public class Programador_Java extends Pessoa{
    private int codigo;
    private int numAnos;
    private String nomeProjeto;
    private Tipo_programador tipo;

    public Programador_Java(int codigo, int numAnos, String nomeProjeto, Tipo_programador tipo, String nome, String dataNasc, int nIF, double salario) {
        super(nome, dataNasc, nIF, salario);
        this.codigo = codigo;
        this.numAnos = numAnos;
        this.nomeProjeto = nomeProjeto;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumAnos() {
        return numAnos;
    }

    public void setNumAnos(int numAnos) {
        this.numAnos = numAnos;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public Tipo_programador getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_programador tipo) {
        this.tipo = tipo;
    }

    

    @Override
    double calcularSalario() {
        double novoSalario = 0;
        
        if (this.getTipo() == Tipo_programador.JUNIOR){
            novoSalario = (getSalario() + (getSalario() * 0.10) + getSalario() * 0.05 * this.getNumAnos());
        }
        else if (this.getTipo() == Tipo_programador.SENIOR){
            novoSalario = (getSalario() + getSalario() * 0.20 + getSalario() + 0.05 * this.getNumAnos());
        }
        return novoSalario;
    }
    
    public String toString() {
        System.out.print(super.toString());
        String text = "Código de funcionário: " + codigo + "\n"
                + "Número de anos de programação Java : " + numAnos + "\n"
                + "Nome do projeto que se encontra a desenvolver : " + nomeProjeto + "\n"
                + "Tipo de programador : " + tipo + "\n";
        return text;
    }

    public String printJavaProgrammer() {
        return super.toString();
    }
}
