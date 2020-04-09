
package ex02;

public class Artist {
    protected String nome;
    protected String nacionalidade;
    protected String birthDate;

    public Artist(String nome, String nacionalidade, String birthDate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.birthDate = birthDate;
    }
    
    public void artistInfo(){
        System.out.println("Nome do Artista: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Data de nascimento: " + birthDate);
    }
}
