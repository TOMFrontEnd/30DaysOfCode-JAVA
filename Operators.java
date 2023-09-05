import java.util.Scanner;

 public class Operators {
    /**
     * Reads user input for a double, an int tip, and an int tax.
     * Calculates the total amount by adding the tip and tax to the input double.
     * Prints the total amount.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a double figure, like 5.0");
        double m = sc.nextDouble();

        System.out.println("Input an int, like 5");
        int tip = sc.nextInt();

        System.out.println("Input an int, like 6");
        int tax = sc.nextInt();

        double ftip = (m * tip) / 100;
        double ftax = (m * tax) / 100;
        int total = (int) Math.round(ftip + ftax + m);

        System.out.println(total);

        sc.close();
    }
}