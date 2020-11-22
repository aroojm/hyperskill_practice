import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int day = s.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, day);
        System.out.println(date.getDayOfMonth() == 1);
    }
}