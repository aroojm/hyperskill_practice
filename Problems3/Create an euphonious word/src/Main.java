import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(countLetters(str));
        s.close();
    }

    public static int countLetters(String str) {
        int count = 0;
        int len = str.length();
        int i = 0;
        int consonant = 0;
        int vowel = 0;

        while (i < len) {
            char x = str.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y') {
                vowel++;
                consonant = 0;
            } else {
                consonant++;
                vowel = 0;
            }
            if (vowel > 2 || consonant > 2) {
                vowel = 0;
                consonant = 0;
                count++;
                continue;
            }
            i++;
        }

        return count;

    }
}