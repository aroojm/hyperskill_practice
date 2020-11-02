import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder s = new StringBuilder("");
        int len = strings.length;

        for(int i =0; i < len; i++){
            StringBuilder sb = new StringBuilder(strings[i]);

            for(int j =0; j < sb.length(); j++){
                if(Character.isDigit(sb.charAt(j))){
                    sb.deleteCharAt(j);
                    j--;
                }
            }
            s.append(sb);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}