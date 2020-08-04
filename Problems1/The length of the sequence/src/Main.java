import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = scanner.nextInt();
        while (i != 0) {
            sum += i;
            i = scanner.nextInt();
        }
        System.out.println(sum);

    }
}