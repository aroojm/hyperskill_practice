import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);

        int noOfCompanies = s.nextInt();

        int[] incomeArray = new int[noOfCompanies];

        for (int i = 0; i < noOfCompanies; i++) {
            incomeArray[i] = s.nextInt();
        }

        int[] taxArray = new int[noOfCompanies];

        for (int i = 0; i < noOfCompanies; i++) {
            taxArray[i] = s.nextInt();
        }

        double maxTax = 0;
        int numOfCompany = 0;

        for (int i = 0; i < noOfCompanies; i++) {
            double tax = incomeArray[i]*taxArray[i]*0.01;
            if(tax > maxTax){maxTax = tax; numOfCompany = i+1;}
        }
        System.out.println(numOfCompany);
    }
}