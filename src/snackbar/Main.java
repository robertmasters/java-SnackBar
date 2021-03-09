package snackbar;


import java.text.DecimalFormat;


public class Main 
{

    private static DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");

	
    public static void main(String[] args)
    {
    	Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob",33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
	    VendingMachine v3 = new VendingMachine("Office");
    
        Snack s1 = new Snack("Chips",36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water",20, 2.75, v2.getId());

        c1.buySnacks(s4.totalCost(3));
        s4.buySnack(3);
        System.out.println("Customer 1 cash on hand " + decimalFormat.format(c1.getCashOnHand()));
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());
        System.out.println();

        c1.buySnacks(s3.totalCost(1));
        s3.buySnack(1);
        System.out.println("Customer 1 cash on hand " + decimalFormat.format(c1.getCashOnHand()));
        System.out.println("Quanity of snack 3 is " + s3.getQuantity());
        System.out.println();

        c2.buySnacks(s4.totalCost(2));
        s4.buySnack(2);
        System.out.println("Customer 2 cash on hand " + decimalFormat.format(c2.getCashOnHand()));
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());
        System.out.println();

        c1.addCashOnHand(10.00);
        System.out.println("Customer 1 cash on hand " + decimalFormat.format(c1.getCashOnHand()));
        System.out.println();

        c1.buySnacks(s2.totalCost(1));
        s2.buySnack(1);
        System.out.println("Customer 1 cash on hand " + decimalFormat.format(c1.getCashOnHand()));
        System.out.println("Quantity of snack 2 is " + s2.getQuantity());
        System.out.println();

        s3.addQuantity(12);
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());
        System.out.println();

        c2.buySnacks(s3.totalCost(3));
        s3.buySnack(3);
        System.out.println("customer 2 cash on hand " + decimalFormat.format(c2.getCashOnHand()));
        System.out.println("Quantity of snack 3 is " +  s3.getQuantity());
        System.out.println();
    }
}