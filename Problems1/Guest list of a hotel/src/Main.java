//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[8];
        for (int i = 0; i < 8; i++) {
            array[i]= scanner.next();
        }
        for (int i = 7; i >= 0; i--) {
         System.out.println(array[i]);
        }
    }
}