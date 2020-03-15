import java.util.Scanner;

public class ex4 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduza graus: ");
        double graus = sc.nextDouble();
        double rad = graus * Math.PI / 180;
        
        System.out.printf("Radianos: %.2f", rad);
 }
}