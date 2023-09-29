package TaxCalculator;

public class TaxCalculator {

    public double price;
    public double getPrice() {return price;}

    public double tax;
    public double getTax() {return tax;}

    public int quantity;
    public int getQuantity() {return quantity;}

    public double total;
    public double getTotal() {return total;}


    public double totalcost;
    public double gettotalcost() {return totalcost;}


    public void printVariables() {
        totalcost = price*quantity *tax;
        System.out.println( "Pret:" + price);
        System.out.println("Taxa:" + tax);
        System.out.println("Cantitate:" + quantity);
        System.out.println("I want to by " + quantity + " shirt");
   System.out.println("Total cost with tax is " + totalcost + " shirt");
    }
}



