package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {
    public static void main(String[] args){

        double payment = 0;
        boolean positivepymt = true;

        do {
            // 1.ask the user for input
            System.out.println("Enter the payment amount: ");
            //2.get the amount and test the value
            Scanner in = new Scanner(System.in);
            //3.Handel exceptions appropriately
            try {
                payment = in.nextDouble();
                if (payment < 0) {
                    throw new NegativePaymentException(payment);
                }
                else{
                    positivepymt = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println("ERROR" + e.toString());
                System.out.println("Please try again");
                positivepymt = false;
            }
        } while(!positivepymt);

        //4. Print confirmation
        System.out.println("Thank you for your payment of $"+ payment);
    }
}
