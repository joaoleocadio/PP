package ex02;

public class CD {
    
    protected String nomeBanda;
    protected String nomeCD;
    protected int tempoTotal;
    protected int ano;
    protected String editora;
    protected int[] elementos;
    protected Track[] musicas; 

    public CD(String nomeCD, int ano, String Editora, Track[] musicas) {
        this.nomeCD = nomeCD;
        this.ano = ano;
        this.editora = Editora;
        if(musicas.length > 0 && musicas.length < 35){
            this.musicas = musicas;
        }
        else{
            System.out.println("Impossível!");
        }
        
    }
    
    public void infoCD(){
        System.out.println("Nome do CD: " + nomeCD);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Editora: " + editora);
        
        
        
        for (Track musicas : musicas) {
            musicas.infoMusica();
        } 
    }
    
}
