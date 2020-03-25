package ex01;


public class User {
    
    
    private static int nextID = 0;
    
    protected final int EXPENSES_SIZE = 31;
    
    
    protected int id;
    public String nome;
    public String email;
    protected String birthDate;
    protected Expense[] expenses;

    public User(String nome, String email, String birthDate) {
        expenses = new Expense[EXPENSES_SIZE];
        this.id = nextID++;
        this.nome = nome;
        this.email = email;
        this.birthDate = birthDate;
    }
 
}
