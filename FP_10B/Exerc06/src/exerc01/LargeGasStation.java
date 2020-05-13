package exerc01;

public class LargeGasStation extends GasStation implements CoffeeService{
    private double precoCafe;

    public LargeGasStation(double precoCafe, double preco, String nome, int numContribuinte) {
        super(preco, nome, numContribuinte);
        this.precoCafe = precoCafe;
    }
    
    @Override
    public double getCoffePrice() {
        return precoCafe;
    }
    
    @Override
    public void setCoffePrice(double p) {
        this.precoCafe = p;
    }

    @Override
    public double getCoffeTotal(int coffees) {
        double total = 0;
        
        total = this.precoCafe * coffees;
        return total;
    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        text += "Preço do café: " + precoCafe + "\n";
        return text;
    }

}
