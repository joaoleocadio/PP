package ex04;

import java.util.Arrays;

public class Ex04 {

    
    public static void main(String[] args) {
        
        Book livro1 = new Book();
        Book livro2 = new Book();
        
        
        livro2.titulo = "ze manel";
        livro1.titulo = "Sem titulo";
        livro1.editor = "Porto Editora";
        livro1.ano = 2018;
        livro1.numeroPaginas = 699;
        livro1.autor1.Acro[0] = 'a';
        livro1.autor1.Acro[1] = 'b';
        livro1.autor1.Acro[2] = 'c';
        livro1.autor1.Nome = "Sporting";
        livro1.autor1.Nacionalidade = "Portuguesa";
        livro1.cotacao[0] = '9';
        livro1.cotacao[1] = '9';
        livro1.cotacao[2] = '9';
        
        
        System.out.println("-------Livro1---------");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Editora: " + livro1.editor);
        System.out.println("Ano de edição: " + livro1.ano);
        System.out.println("Total de páginas: " + livro1.numeroPaginas);
        System.out.println("Acrónimo: " + livro1.autor1.Acro[0] + livro1.autor1.Acro[1] + livro1.autor1.Acro[2]);
        System.out.println("Nome: " + livro1.autor1.Nome);
        System.out.println("Nacionalidade: " + livro1.autor1.Nacionalidade);
        System.out.println("");
        System.out.println("-------Livro2---------");
        System.out.println("Titulo: " + livro2.titulo);
        
        
    }
    
}
