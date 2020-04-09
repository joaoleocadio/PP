package ex02;

public class Ex02 {

    public static void main(String[] args) {
        Track[] lista = {new Track(1, "Ho Hey", 90, "Luminers"),
                         new Track(2, "Stubborn Love", 105, "Wesley Schultz")};
        
        CD cd = new CD("The Lumineers", 2012, "Dualtone Records", lista);
        
        Artist artista1 = new Artist("João Leocádio", "Portuguesa" , "2020-08-20");
        
        cd.infoCD();
        System.out.println("");
        artista1.artistInfo();
    }  
}
