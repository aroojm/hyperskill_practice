import java.util.Scanner;

class NumbersFilter extends Thread {


    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}