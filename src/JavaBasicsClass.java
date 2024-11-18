//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
  program that declares two integer variables, assigns an integer to each,
 and adds them together. Assign the sum to a variable. Print out the result.
 */
public class JavaBasicsClass {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int sum = a + b;
        System.out.println("the sum is" + sum);
        /**
         *  program that declares two double variables, assigns a
         * number to each, and adds them
         * together. Assign the sum to a variable. Print out the result.
         */
        double c = 8.15;
        double d = 4.5;
        double sum1 = c + d;
        System.out.println("the sum is" + sum1);
        /**
         *  program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
         * Assign the result to a variable. Print out the result. Now change
         * the larger number to a decimal. What happens? What corrections are needed?
         */
        int div = a / b;
        System.out.println("the divation is" + div);
        /**
         * Write a program that declares two double variables, assigns
         * a number to each, and divides the larger by the smaller number.
         * Assign the result to a variable. Print out the result.
         *Now, cast the result to an integer. Print out the result again.
         */
        double divv = c / d;
        int intValue = (int) divv;
        System.out.println("the divation of " + c + "and" + d + " is " + divv + "=" + intValue);
        /**
         * Write a program that declares two integer variables, x and y, and assigns
         the number 5 to x and the number 6 to y. Declare a variable q and assign
         y/x to it and print q. Now, cast y to a double and assign it to q. Print q again

         */
        int x = 5;
        int y = 6;
        double q = (double) y / x;
        System.out.println("the divation of " + x + "and" + y + " is " + q);
        /**
         *

         Write a program that declares a named constant and
         uses it in a calculation. Print the result.

         */
        final double PI = 3.14159265358979;
        int r = 1;

        double r1 = PI * r;
        System.out.printf("the area is ", r1);
        /** Write a program where you create three variables that represent
         * products at a cafe. The products could be beverages like coffee,  ,
         * espresso, green tea, etc. Assign prices to each product. Create two more variables
         * called subtotal and totalSale and complete an “order” for three items of the
         * first product, four items of the second product, and two items of the third product.
         * Add them all together to calculate the subtotal. Create a constant called
         * SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
         * Be sure to format the results to two decimal places.
         */
        Coffee cof = new Coffee();
       int finalPriceOfCoffee= (int)cof.calculateTotalSale();
       System.out.println("the total price is" + finalPriceOfCoffee);


    }
}



