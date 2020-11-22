import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.parse(s.next());
        int sec = ((dt.getDayOfYear() - 1) * 24) + (dt.toLocalTime().toSecondOfDay() / 3600);
        System.out.println(sec);
    }
}