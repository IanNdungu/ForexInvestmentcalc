import java.util.Scanner;
import java.text.*;

public class Driver {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while (true) {
            System.out.println("Enter the closing price for day " + day + " (or -1 to quit): ");
            closingPrice = scan.nextDouble();
            if (closingPrice == -1) break;
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0){
                System.out.println("After day " + day + " you have earned " + df.format(earnings) + " per share.");
            }
            else if (earnings < 0){
                System.out.println("After day " + day + " you have lost " + df.format(earnings) + " per share.");
            }
            else {
                System.out.println("After day " + day + " you have broken even.");
            }
            day += 1;
        }
        scan.close();
    }
}