package exerc01;

import interfaces.GasService;

/**
 *
 * @author Utilizador
 */
public class GasStation extends Empresa implements GasService{
    private double precoGas;

    public GasStation(double preco, String nome, int numContribuinte) {
        super(nome, numContribuinte);
        this.precoGas = preco;
    }

    /**
     * 
     * @return
     */
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

    public static GasStation comparar(GasStation gr[]){
        double precoBaixo = gr[0].precoGas;
        
        for(int i = 0; i < gr.length; i++){
            if(gr[i].precoGas < precoBaixo){
                precoBaixo = gr[i].precoGas;
            }
        }
        
        for(int i = 0; i < gr.length; i++){
            if(gr[i].precoGas == precoBaixo){
                return gr[i];
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        text += "Preço do gas: " + precoGas + "\n";
        return text;
    }
      
}
