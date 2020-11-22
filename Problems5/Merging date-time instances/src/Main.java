import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        int year = dateTime1.getYear() > dateTime2.getYear() ? dateTime1.getYear() : dateTime2.getYear();
        int month = dateTime1.getMonthValue() > dateTime2.getMonthValue() ?
                    dateTime1.getMonthValue() : dateTime2.getMonthValue();
        int day = dateTime1.getDayOfMonth() > dateTime2.getDayOfMonth() ?
                    dateTime1.getDayOfMonth() : dateTime2.getDayOfMonth();
        int hour = dateTime1.getHour() > dateTime2.getHour() ? dateTime1.getHour() : dateTime2.getHour();
        int min = dateTime1.getMinute() > dateTime2.getMinute() ? dateTime1.getMinute() : dateTime2.getMinute();
        int sec = dateTime1.getSecond() > dateTime2.getSecond() ? dateTime1.getSecond() : dateTime2.getSecond();
        return LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(hour, min, sec));
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}