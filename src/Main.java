import TaxCalculator.TaxCalculator;

public class Main {
    public static void main(String[] args) {

        double price = 25.50;
        double tax = 0.01;
        int quantity = 2;
        double total = 0;
        String Messager  = "I want to by  " + quantity + " shirt";

       total = price * quantity * tax;

        System.out.println( "Pret:" + price);
        System.out.println("Taxa:" + tax);
        System.out.println("Cantitate:" + quantity);

        System.out.println(Messager);
        System.out.println("Total cost with tax is " + total + " shirt");
    }
}