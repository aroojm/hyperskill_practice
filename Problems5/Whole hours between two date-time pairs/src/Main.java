import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDateTime dt1 = LocalDateTime.parse(s.next());
        LocalDateTime dt2 = LocalDateTime.parse(s.next());
        int hrs = 0;
        while (dt1.truncatedTo(ChronoUnit.MINUTES).compareTo(dt2.truncatedTo(ChronoUnit.MINUTES)) < 1) {
            hrs++;
            dt1 = dt1.plusHours(1);
        }
        System.out.println(--hrs);
    }
}