import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) {
        if (number <= 0 || number > 7) {
            throw new IllegalArgumentException("Invalid day");
        } else {
            int x = number % 7;
            String name = "Sun";
            switch (x) {
                case 1:
                    name = "Mon";
                    break;
                case 2:
                    name = "Tue";
                    break;
                case 3:
                    name = "Wed";
                    break;
                case 4:
                    name = "Thu";
                    break;
                case 5:
                    name = "Fri";
                    break;
                case 6:
                    name = "Sat";
                    break;
                default:
                    break;
            }
            return name;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}