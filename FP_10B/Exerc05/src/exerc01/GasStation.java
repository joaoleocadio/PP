package exerc01;

public class GasStation extends Empresa implements GasService{
    private double precoGas;

    public GasStation(double preco, String nome, int numContribuinte) {
        super(nome, numContribuinte);
        this.precoGas = preco;
    }

    @Override
    public double getPreco() {
        return precoGas;
    }

    @Override
    public void setPreco(double preco) {
        this.precoGas = preco;
    }
    
    @Override
    public double getGasTotal(double litros){
        double total = 0;
        
        total = this.getPreco() * litros;
        return total;
    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        text += "Preço do gas: " + precoGas + "\n";
        return text;
    }
      
}
