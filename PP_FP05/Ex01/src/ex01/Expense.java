package ex01;

public class Expense {
    
    private static int nextID = 0;
    
    public int id;
    protected String type;
    protected float amount;
    protected String date;

    public Expense(String type, float amount, String date) {
        this.id = nextID++;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }
    
    
}
