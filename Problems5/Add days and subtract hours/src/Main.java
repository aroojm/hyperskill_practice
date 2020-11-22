import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split(" ");
        LocalDateTime dt = LocalDateTime.parse(input[0]);
        int days = Integer.parseInt(input[1]);
        int hrs = Integer.parseInt(input[2]);
        System.out.println(dt.plusDays(days).minusHours(hrs));
    }
}