import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String s = str.trim();
        reader.close();
        if (s.length() == 0) {
            System.out.print("0");
        } else {
            String[] array = s.split("\\s+");
            System.out.print(array.length);
        }
    }
}