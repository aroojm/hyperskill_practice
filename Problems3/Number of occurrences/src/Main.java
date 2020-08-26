import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String subStr = s.nextLine();
        System.out.println(countSubstring(str, subStr));
        s.close();
    }

    public static int countSubstring(String str, String subStr) {
        int count = 0;
        int lenStr = str.length();
        int lenSubStr = subStr.length();
        int i = 0;
        while (i < lenStr) {
            if (str.charAt(i) == subStr.charAt(0)) {
                if (str.substring(i, i + lenSubStr).equals(subStr)) {
                    count++;
                    i += lenSubStr;
                    continue;
                }
            }
            i++;
        }
        return count;
    }
}