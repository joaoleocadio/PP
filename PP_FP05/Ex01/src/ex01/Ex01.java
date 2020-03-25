package ex01;

public class Ex01 {

    public static void main(String[] args) {
        // TODO code application logic here
        User user1 = new User("João", "joao@gmail.com", "1998-08-20");
        User user2 = new User("Zé", "ze@gmail.com", "1999-10-05");
        Expense despesa1 = new Expense("Alimentar", 128.32f, "2020-02-22");
        Expense despesa2 = new Expense("Automóvel", 80.32f, "2020-02-05");
        
        System.out.println("-------Utilizador1----------");
        System.out.println("Nome: " + user1.nome);
        System.out.println("Email: " + user1.email);
        System.out.println("Data Nascimento: " + user1.birthDate);
        System.out.println("-------Utilizador2----------");
        System.out.println("Nome: " + user2.nome);
        System.out.println("Email: " + user2.email);
        System.out.println("Data Nascimento: " + user2.birthDate);
        System.out.println("-------Despesa1-------");
        System.out.println("Despesa tipo: " + despesa1.type);
        System.out.println("Data: " + despesa1.date);
        System.out.println("Valor: " + despesa1.amount);
        System.out.println("-------Despesa2-------");
        System.out.println("Despesa tipo: " + despesa2.type);
        System.out.println("Data: " + despesa2.date);
        System.out.println("Valor: " + despesa2.amount);
    }
    
}
