import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        boolean flag = true;

        while (j != 0) {
            if (i < j) {
                while (j != 0) {
                    i = j;
                    j = scanner.nextInt();
                    if (i > j && j != 0) {
                        flag = false;
                    }
                }
            }

            else if (i > j) {
                while (j != 0) {
                    i = j;
                    j = scanner.nextInt();
                    if (i < j) {
                        flag = false;
                    }
                }
            } else {
                j = scanner.nextInt();
            }
        }
        System.out.println(flag);

        scanner.close();
    }
}