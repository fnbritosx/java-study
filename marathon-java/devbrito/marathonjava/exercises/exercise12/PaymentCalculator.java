package devbrito.marathonjava.exercises.exercise12;

import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        // This program reads the price of a product and determines the final amount
        // to be paid based on the buyer's payment method choice.
        // It applies discounts or interest according to the payment condition code.
        //
        // Payment condition codes:
        // 1 - Cash or Pix payment, 15% discount
        // 2 - Credit card payment in full, 10% discount
        // 3 - Payment in 2 installments on credit card, no interest
        // 4 - Payment in 3 or more installments on credit card, 10% interest added

        Scanner scanner = new Scanner(System.in);
        double totalValue = 0;

        System.out.print("Enter the product price: R$");
        double productPrice = scanner.nextDouble();

        System.out.println("Payment Method");
        System.out.println("1 - Cash or Pix payment, 15% discount");
        System.out.println("2 - Credit card payment in full, 10% discount");
        System.out.println("3 - Payment in 2 installments on credit card, no interest");
        System.out.println("4 - Payment in 3 or more installments on credit card, 10% interest added");
        int paymentMethod = scanner.nextInt();

        if (paymentMethod < 1 || paymentMethod > 4) {
            throw new IllegalArgumentException("Invalid input: choose a number between 1 and 4.");
        }

        if (paymentMethod == 1) {
                totalValue = productPrice - productPrice * 0.15;
            } else if (paymentMethod == 2) {
                totalValue = productPrice - productPrice * 0.10;
            } else if (paymentMethod == 3) {
                totalValue = productPrice;
            } else if (paymentMethod == 4) {
                totalValue = productPrice + productPrice * 0.10;
            }

        System.out.printf("Product price: R$%.2f%n", productPrice);
        System.out.printf("Total to pay: R$%.2f%n", totalValue);


        scanner.close();
    }
}
