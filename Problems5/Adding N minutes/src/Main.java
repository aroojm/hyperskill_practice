import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.parse(s.next()).plusMinutes(s.nextInt());
        System.out.println(dt.getYear() + " " + dt.getDayOfYear() + " " + dt.toLocalTime());
    }
}