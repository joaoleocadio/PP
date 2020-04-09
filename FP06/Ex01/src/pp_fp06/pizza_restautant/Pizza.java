package pp_fp06.pizza_restautant;

import pp_fp06.pizza_restaurant.enums.Tamanho;

/**
 *
 * @author Utilizador
 */
public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private int codigo;
    private String nome;
    private String descricao;
    private float preco;
    private Tamanho tamanho;
    private int numIngredientes;
    private Ingrediente[] ingredientes;

    /**
     *
     * @param codigo
     * @param nome
     * @param descricao
     * @param numIngredientes
     * @param ingredientes
     */
    public Pizza(int codigo, String nome, String descricao, int numIngredientes, Ingrediente[] ingredientes, Tamanho tamanho) {
        
        if (numIngredientes != 0 && numIngredientes <= MAX_INGREDIENTES){
            this.codigo = codigo;
            this.nome = nome;
            this.descricao = descricao;
            this.numIngredientes = numIngredientes;
            this.ingredientes = ingredientes;
            this.tamanho = tamanho;
        }else{
            System.out.println("Erro nos ingredientes! ");
        }
    }

    public String getDescricao() {
        
        this.descricao = "";
        this.descricao += "A pizza " + this.nome + "tem " + this.numIngredientes
                            + "Ingredientes:  \n";
        
        for (Ingrediente ingrediente : ingredientes){
            this.descricao += ingrediente.getNome() + "";
            this.descricao += ingrediente.getCodigo() + "";
            this.descricao += ingrediente.getOrigem() + "\n";
        }
        return descricao;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    public void setNumIngredientes(int numIngredientes) {
        this.numIngredientes = numIngredientes;
    } 
    
    public void imprimirPizza(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Nº de Ingredientes: " + this.numIngredientes);
        
        for(Ingrediente ingrediente : ingredientes){
            ingrediente.print();
        }
    }

    public void removerIngrediente(int id){
        int[] posicao = new int[ingredientes.length];
        int encontrado = 0;
        
        for(int i = 0; i < ingredientes.length; i++){
            if(ingredientes[i].getCodigo() == id){
                posicao[i] = 1;
                encontrado +=1;
            }
        }
        
        
        if (encontrado > 0){
            Ingrediente[] tmp = new Ingrediente[ingredientes.length - encontrado];
            int tmpPosicao = 0;
            
            for(int i = 0; i < posicao.length; i++){
                if (posicao[i] == 0){
                    tmp[tmpPosicao] = ingredientes[i];
                    tmpPosicao += 1;
                }
            }
            
            this.ingredientes = tmp;
        }else{
            System.out.println("Ingrediente não encontrado! ");
        }
    }
    
    
    
}
