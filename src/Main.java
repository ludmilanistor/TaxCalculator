import TaxCalculator.TaxCalculator;

public class Main {
    public static void main(String[] args) {

        TaxCalculator calc= new TaxCalculator();
        calc.price = 25.50;
        calc.tax = 2.01;
        calc.quantity = 2;
        calc.total = 0;
     //  String Messager  = "I want to by  " + calc.quantity + " shirt";


        calc.printVariables();
    //    System.out.println(Messager);
    }
}

