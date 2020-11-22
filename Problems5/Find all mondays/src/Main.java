import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int month = s.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        for (int i = 1; i < 8; i++) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                break;
            }
            date = date.plusDays(1);
        }
        while (date.getMonthValue() == month) {
            System.out.println(date);
            date = date.plusDays(7);
        }
    }
}