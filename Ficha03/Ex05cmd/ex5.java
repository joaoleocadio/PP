public class Ex05 {

    public static void main(String[] args) {
        double cambioDolar = 0.90;
        double cambioEuro = 1.11;
        String euro = "e", dolar = "d";
        double valor = Double.parseDouble(args[0]);
        double valor2;
        
        if (args[1].equals(euro)){
            valor2 = valor * cambioEuro;
            System.out.println("Valor em euros: "+ valor2);
        } else if (args[1].equals(dolar)){
            valor2 = valor * cambioDolar;
            System.out.println("Valor em dolar: "+ valor2);
        }
    }
    
}