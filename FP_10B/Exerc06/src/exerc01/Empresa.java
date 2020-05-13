package exerc01;

public class Empresa {
    private String nome;
    private int numContribuinte;

    public Empresa(String nome, int numContribuinte) {
        this.nome = nome;
        this.numContribuinte = numContribuinte;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumContribuinte() {
        return numContribuinte;
    }

    public void setNumContribuinte(int numContribuinte) {
        this.numContribuinte = numContribuinte;
    }

   @Override
    public String toString() {
        String text = "";
        text += "Company name: " + nome + "\n";
        text += "Company vatNumber: " + numContribuinte + "\n";
        return text;
    }
    
    
}
