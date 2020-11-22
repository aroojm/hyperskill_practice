import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalTime t = LocalTime.ofSecondOfDay(s.nextInt());
        if (t.getSecond() != 0) {
            System.out.println(t);
        } else {
            System.out.println(LocalTime.of(t.getHour(), t.getMinute()));
        }
    }
}