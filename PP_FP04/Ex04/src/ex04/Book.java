package ex04;

/**
 *
 * @author Utilizador
 * Definição de Livro
 */
public class Book {
    public final static int MAX_CRITICAS = 3;

    /**
     * Titulo do Livro
     */
    public static String titulo;

    /**
     * Editor do Livro
     */
    public static String editor;
    public static int ano;
    public static int numeroPaginas;
    public static int[] cotacao = new int[MAX_CRITICAS];
    
    public Authors autor1 = new Authors();
    public Authors autor2 = new Authors();
    
}
