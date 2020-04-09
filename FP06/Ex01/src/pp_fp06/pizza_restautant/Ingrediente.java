
package pp_fp06.pizza_restautant;

import pp_fp06.pizza_restaurant.enums.Origem;

/**
 *
 * @author Utilizador
 */
public class Ingrediente {
    private int codigo;
    private String nome;
    private int numCalorias;
    private Origem origem;

    public Ingrediente(int codigo, String nome, Origem origem) {
        this.codigo = codigo;
        this.nome = nome;
        this.origem = origem;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumCalorias() {
        return numCalorias;
    }

    public Origem getOrigem() {
        return origem;
    }
    
    public void print(){
        System.out.print(this.nome + " " + this.codigo + " " + this.origem);
    }
}
