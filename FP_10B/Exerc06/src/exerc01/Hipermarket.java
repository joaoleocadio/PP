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

    /**
     * Construtor de Hipermarket 
     * 
     * @param coffePrice preço do café
     * @param gasPrice preço da gasolina
     * @param aRate taxa de juros
     * @param precoBatatas preço das batatas
     * @param nome nome da empresa
     * @param numContribuinte numero de contribuinte
     */
    public Hipermarket(double coffePrice, double gasPrice, double aRate, double precoBatatas, String nome, int numContribuinte) {
        super(precoBatatas, nome, numContribuinte);
        this.coffePrice = coffePrice;
        this.gasPrice = gasPrice;
        this.aRate = aRate;
        this.precoBatatas = precoBatatas;
    }
    
    /**
     * Método abstrato implementado nas sub classes
     * @param purchaseValue
     * @return
     */
    public abstract int getPoints(double purchaseValue);
    
    /**
     * Getter de coffe price
     * @return
     */
    @Override
    public double getCoffePrice() {
        return coffePrice;
    }

    /**
     * Setter de coffe price
     * @param p
     */
    @Override
    public void setCoffePrice(double p) {
        this.coffePrice = p;
    }

    /**
     * Método que torna o preço total dos cafés
     * @param coffees
     * @return
     */
    @Override
    public double getCoffeTotal(int coffees) {
        double total = 0;
        total = this.getCoffePrice() * coffees;
        return total;
    }

    /**
     * Getter da taxa Anual
     * @return
     */
    @Override
    public double getAnnualRate() {
        return aRate;
    }

    /**
     * Setter da taxa Anual
     * @param r
     */
    @Override
    public void setAnnualRate(double r) {
        this.aRate = r;
    }

    /**
     * Método que retorna o pagamento mensal e calcula a taxa Mensal
     * @param ammount
     * @param meses
     * @return
     */
    @Override
    public double computeMonthlyPayment(double ammount, int meses) {
        double taxaMensal = 0;
        double pagamento = 0;
        
        taxaMensal = (Math.pow(1 + this.getAnnualRate(), 1/12) -1);
        pagamento = (taxaMensal * ammount) / (1 - (Math.pow(1 + taxaMensal, -meses)));
        
        return pagamento;
    }

    /**
     * Getter do preço do gás
     * @return
     */
    @Override
    public double getPreco() {
        return gasPrice;
    }

    /**
     * Setter do preço do gás
     * @param preco
     */
    @Override
    public void setPreco(double preco) {
        this.gasPrice = preco;
    }

    /**
     * Método que retorna o preço total do gas
     * @param litros
     * @return
     */
    @Override
    public double getGasTotal(double litros) {
        double total = 0;
        
        total = this.getPreco() * litros;
        return total;
    }

    /**
     * Getter do preço das Batatas
     * @return
     */
    @Override
    public double getPotatoesPrice() {
        return precoBatatas;
    }

    /**
     * Setter do preço das Batatas
     * @param p
     */
    @Override
    public void setPotatoesPrice(double p) {
        this.precoBatatas = p;
    }

    /**
     * Método que retorna o preço total das batatas
     * @param kilos
     * @return
     */
    @Override
    public double getMarketTotal(double kilos) {
        double total = 0;
        
        total = this.getPotatoesPrice() * kilos;
        return total;      
    }

    /**
     * Método que verifica qual o hipercado que atribui mais pontos de acordo
     * com as situações descritas no enunciado
     * @param purchaseValue Valor das compras
     * @param j1 jumbo
     * @param c1 continente
     */
    public static void verificarPontos(double purchaseValue, JumbHipermarket j1, ContinentHipermarket c1){
        int a = j1.getPoints(purchaseValue);
        int b = c1.getPoints(purchaseValue);
        
        if(a > b){
            System.out.println("O Hipermercado " + j1.getNome() + " atribui mais pontos");
        } else {
            System.out.println("O Hipermercado " + c1.getNome() + " atribui mais pontos");
        }
    }
    
    /**
     * Método que compara qual o cabaz mais barato 
     * @param hm
     * @param q
     * @param l
     * @param c
     * @return
     */
    public static Hipermarket cabazBarato(Hipermarket hm[], double q, double l, int c){
        double preco = hm[0].getMarketTotal(q)
                       + hm[0].getGasTotal(l)
                       + hm[0].getCoffeTotal(c);
        
        for(int i = 0; i < hm.length; i++){
            if(hm[i].getMarketTotal(q) + hm[i].getGasTotal(l) + hm[i].getCoffeTotal(c) < preco){
                preco = hm[i].getMarketTotal(q) + hm[i].getGasTotal(l) + hm[i].getCoffeTotal(c);
            }
        }
        
        for(int i = 0; i < hm.length; i++){
            if(hm[i].getMarketTotal(q) + hm[i].getGasTotal(l) + hm[i].getCoffeTotal(c) == preco){
                System.out.println(preco);
                return hm[i];
            }
        }
        return null;
    }
    
    /**
     * Método toString para imprimir
     * @return
     */
    @Override
    public String toString() {
        String text = "";

        text += super.toString();
        text += "Coffee Price : " + coffePrice + " €" + "\n";
        text += "Gas Price : " + gasPrice + " €" + "\n";
        text += "Anual Rate : " + aRate + "%" + "\n";

        return text;
    } 


}
