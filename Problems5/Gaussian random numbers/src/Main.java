import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        scanner.close();
        boolean flag = true;

        while(flag){
            Random r = new Random(k);
            for (int i = 0; i < n; i++) {
                double num = r.nextGaussian();
                if (num > m) {
                    k++;
                    break;
                }
                if (i == n - 1) {
                    flag = false;
                }
            }
        }
        System.out.println(k);

    }
}