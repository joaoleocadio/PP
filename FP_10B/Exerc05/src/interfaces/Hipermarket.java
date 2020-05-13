package exerc01;

import interfaces.HipermarketService;

/**
 *
 * @author Utilizador
 */
public abstract class Hipermarket extends Supermarket implements HipermarketService{
    private double coffePrice;
    private double gasPrice;
    private double aRate;
    private double precoBatatas;

    public Hipermarket(double coffePrice, double gasPrice, double aRate, double precoBatatas, String nome, int numContribuinte) {
        super(precoBatatas, nome, numContribuinte);
        this.coffePrice = coffePrice;
        this.gasPrice = gasPrice;
        this.aRate = aRate;
        this.precoBatatas = precoBatatas;
    }
    
    public abstract int getPoints(double purchaseValue);
    
    @Override
    public double getCoffePrice() {
        return coffePrice;
    }

    @Override
    public void setCoffePrice(double p) {
        this.coffePrice = p;
    }

    @Override
    public double getCoffeTotal(int coffees) {
        double total = 0;
        total = this.getCoffePrice() * coffees;
        return total;
    }

    @Override
    public double getAnnualRate() {
        return aRate;
    }

    @Override
    public void setAnnualRate(double r) {
        this.aRate = r;
    }

    @Override
    public double computeMonthlyPayment(double ammount, int meses) {
        double taxaMensal = 0;
        double pagamento = 0;
        
        taxaMensal = (Math.pow(1 + this.getAnnualRate(), 1/12) -1);
        pagamento = (taxaMensal * ammount) / (1 - (Math.pow(1 + taxaMensal, -meses)));
        
        return pagamento;
    }

    @Override
    public double getPreco() {
        return gasPrice;
    }

    @Override
    public void setPreco(double preco) {
        this.gasPrice = preco;
    }

    @Override
    public double getGasTotal(double litros) {
        double total = 0;
        
        total = this.getPreco() * litros;
        return total;
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
        text += "Coffee Price : " + coffePrice + " €" + "\n";
        text += "Potatoes Price : " + precoBatatas + " €" + "\n";
        text += "Gas Price : " + gasPrice + " €" + "\n";
        text += "Anual Rate : " + aRate + "%" + "\n";

        return text;
    }    
}
