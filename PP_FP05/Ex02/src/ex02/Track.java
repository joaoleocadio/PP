
package ex02;

public class Track {
    protected int numFaixa;
    protected String nome;
    protected int duracao;
    protected String nomeAutor;

    public Track(int numFaixa, String nome, int duracao, String nomeAutor) {
        this.numFaixa = numFaixa;
        this.nome = nome;
        this.duracao = duracao;
        this.nomeAutor = nomeAutor;
    }
    
    public void infoMusica(){
        System.out.println("Música número: " + numFaixa + " com o título " + nome);
        System.out.println("Duração: " + duracao);
        System.out.println("Autor: " + nomeAutor);
    }
}
