import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() < 12) {
            System.out.println("NO");
        } else {
            boolean check = checkLowerCase(str) &&
                    checkUpperCase(str) &&
                    checkDigit(str);
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean checkLowerCase(String s) {
        String regexp = "[a-z]+";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
    public static boolean checkUpperCase(String s) {
        String regexp = "[A-Z]+";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
    public static boolean checkDigit(String s) {
        String regexp = "[0-9]+";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
    // Better method
//    public static void checkPassword(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine();
//
//        String digitPattern = ".*[0-9]+.*";
//        String lowerCasePattern = ".*[a-z]+.*";
//        String upperCasePattern = ".*[A-Z]+.*";
//
//        if (password.matches(digitPattern)
//                && password.matches(lowerCasePattern)
//                && password.matches(upperCasePattern)
//                && password.length() >= 12) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
}