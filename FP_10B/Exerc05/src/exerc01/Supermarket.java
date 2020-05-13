package exerc01;

import interfaces.MarketService;

public class Supermarket extends Empresa implements MarketService{
    private double precoBatatas;

    public Supermarket(double precoBatatas, String nome, int numContribuinte) {
        super(nome, numContribuinte);
        this.precoBatatas = precoBatatas;
    }

    @Override
    public double getPotatoesPrice() {
        return precoBatatas;
    }

    @Override
    public void setPotatoesPrice(double p) {
        this.precoBatatas = p;
    }

    @Override
    public double getMarketTotal(double kilos) {
        double total = 0;
        
        total = this.getPotatoesPrice() * kilos;
        return total;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        return text;
    }
    
}
