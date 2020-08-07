import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();

        int[] myArray = new int[length];

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }

        int product = 0;

        for (int i = 0; i < length-1 ; i++) {
            int calculated = myArray[i]*myArray[i+1];

            if ( product < calculated) {
                product = calculated;
            }

        }
        System.out.println(product);
    }
}