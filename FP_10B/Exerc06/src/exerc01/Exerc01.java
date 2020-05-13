package exerc01;

public class Exerc01 {

    public static void main(String[] args) {
        
        ContinentHipermarket continente = new ContinentHipermarket(0.60, 1.25, 12.2, 0.50, "Continente", 1478963);
        JumbHipermarket jumbo = new JumbHipermarket(0.60, 1.12, 14.2, 0.62, "Jumbo", 14752896);
        
        Hipermarket.verificarPontos(80, jumbo, continente);
        
        GasStation g1 = new GasStation(1.10, "Cepsa", 14178555);
        GasStation g2 = new GasStation(1.12, "galp", 123654789);
        GasStation g3 = new GasStation(1.16, "Repsol", 7531598);
        GasStation g4 = new GasStation(1.17, "BP", 5489753);
        
        GasStation grupo[] = {g1, g2, g3, g4};
        
        System.out.println("###########");
        System.out.println("Gasolina mais barata: ");
        GasStation gf = GasStation.comparar(grupo);
        System.out.println(gf.toString());
        System.out.println("###########");
        
        Hipermarket hgroup[] = {continente, jumbo};
        Hipermarket gh = Hipermarket.cabazBarato(hgroup, 12.5, 10.0, 5);
        System.out.println(gh.toString());   
    }
}
