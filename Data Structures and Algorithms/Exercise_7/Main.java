package Exercise_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValuePredictor vp = new ValuePredictor();
        try {
            System.out.print("Enter the initial amount: ");
            double initialAmount = Double.parseDouble(sc.nextLine());
            System.out.print("Enter number of years: ");
            int years = Integer.parseInt(sc.nextLine());
            System.out.print("Enter growth rate (%): ");
            double growthRate = Double.parseDouble(sc.nextLine()) / 100.0;
            double answer = vp.predictValue(initialAmount, years, growthRate);
            System.out.printf("Predicted value after %d years is ₹%.2f%n",years, answer);
        } catch (NumberFormatException e) {
            System.out.println("Enter valid numbers only.");
        }
        sc.close();
    }
}