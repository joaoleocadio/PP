package ficha9;

import java.util.Arrays;
import java.util.Date;

public class Gestor_projeto extends Pessoa{
    private int codigo;
    private String[] projetos;
    private Date dataContrato;

    public Gestor_projeto(int codigo, String[] projetos, Date dataContrato, String nome, String dataNasc, int nIF, double salario) {
        super(nome, dataNasc, nIF, salario);
        this.codigo = codigo;
        this.projetos = projetos;
        this.dataContrato = dataContrato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String[] getProjetos() {
        return projetos;
    }

    public void setProjetos(String[] projetos) {
        this.projetos = projetos;
    }
    
    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }
    

    
    @Override
    double calcularSalario() {
        return (this.getSalario() + this.getSalario() * 0.15 + this.getDataContrato().getYear() * 0.015 + this.getSalario() * 0.01 * this.projetos.length);
        
    }
    
    public String toString() {
        System.out.print(super.toString());
        String text = "Código de funcionário: " + codigo + "\n"
                + "Conjunto de projetos que gere : " + Arrays.toString(projetos) + "\n"
                + "Data da contratação : " + dataContrato + "\n";
        return text;
    }
    
     public String printProjectManager() {
        return super.toString();
    }
    
    
}
