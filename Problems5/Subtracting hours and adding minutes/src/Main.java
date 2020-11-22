import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.parse(s.next());
        int hours = s.nextInt();
        int min = s.nextInt();
        System.out.println(dt.minusHours(hours).plusMinutes(min));
    }
}