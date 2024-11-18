public class Coffee {
    double coffeeP = 3.0;
    double cappuccinoP = 3.9;
    double espressoP = 3.80;
    double greenTeaP = 2.0;
    double subtotal;
    double totalSale;

    int cofee = 3;
    int cappuccino = 4;
    int espresso = 2;
    final double SALES_TAX = 0.06;

    public double calculateTotalSale() {
        subtotal = coffeeP * cofee + cappuccinoP * cappuccino + espressoP * espresso;
        totalSale = subtotal + (subtotal * SALES_TAX);
        return totalSale;
    }
}
