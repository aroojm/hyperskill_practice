import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalTime time = LocalTime.parse(s.next());
        System.out.println(LocalTime.of(time.getHour(), time.getMinute()));
    }
}