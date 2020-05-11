package ficha9;

import enums.Habilitacoes;
import enums.tipoContrato;
import java.util.Date;

/**
 *
 * @author Utilizador
 */
public class Administrativo extends Pessoa{
    private String sigla;
    private tipoContrato contrato;
    private Habilitacoes habilitacao;
    private String dataContrato;
    private String fimContrato = null;

    public Administrativo(tipoContrato contrato, Habilitacoes habilitacao, String nome, String dataNasc, int nIF, double salario) {
        super(nome, dataNasc, nIF, salario);
        this.contrato = contrato;
        this.habilitacao = habilitacao;
    }

    
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public tipoContrato getContrato() {
        return contrato;
    }

    public void setContrato(tipoContrato contrato) {
        this.contrato = contrato;
    }

    public Habilitacoes getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(Habilitacoes habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }

    public String getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(String fimContrato) {
        this.fimContrato = fimContrato;
    }

    @Override
    double calcularSalario() {
        double novoSalario = 0;
        
        if (this.getHabilitacao() == Habilitacoes.LICENCIATURA){
            novoSalario = this.getSalario() + (this.getSalario() * 0.10);
        }
        else if (this.getHabilitacao() == Habilitacoes.MESTRADO){
            novoSalario = this.getSalario() + (this.getSalario() * 0.20);
        }
        else if (this.getHabilitacao() == Habilitacoes.DOUTORAMENTO){
            novoSalario = this.getSalario() + (this.getSalario() * 0.30);
        }
        return novoSalario;
    }
    
    public String toString() {
        System.out.print(super.toString());
        String text = "Sigla : " + sigla + "\n"
                + "Tipo de contrato : " + contrato + "\n"
                + "Habilitações literárias : " + habilitacao + "\n"
                + "Data da contratação : " + dataContrato + "\n"
                + "Data de fim de contrato : " + fimContrato + "\n";
        return text;
    }
    
    public String printAdministrative() {
        return super.toString();
    }
}
