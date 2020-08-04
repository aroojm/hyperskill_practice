import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int i = 2;
        while ((m/2)> 1) {
            i++;

        }
        System.out.println(i);
    }
}