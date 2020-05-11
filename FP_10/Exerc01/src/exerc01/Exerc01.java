package exerc01;

public class Exerc01 {

    public static void main(String[] args) {
        /*GasStation galp = new GasStation(1.00, "Galp", 15633906);
        System.out.println(galp);
        System.out.println("Preço do gas: " + galp.getGasTotal(5.0));
        
        LargeGasStation station1 = new LargeGasStation(0.60, 1.15, "sadasdas", 147852);
        System.out.println(station1);
        System.out.println("Total Cafés: " + station1.getCoffeTotal(2));
        
        Supermarket market1 = new Supermarket(0.35, "Ze das Batatas", 34563413);
        System.out.println(market1);
        System.out.println("Total Batatas: " + market1.getMarketTotal(10));*/
        
        Hipermarket market = new Hipermarket(0.60, 1.10, 0.23, 0.35, "Continente", 9999999);
        System.out.println(market);
        System.out.println(market.computeMonthlyPayment(10000, 5));
    }
    
}
