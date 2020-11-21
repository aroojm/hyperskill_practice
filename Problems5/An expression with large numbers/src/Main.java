import java.util.Scanner;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().split("\\s+");
        try {
            BigInteger a = new BigInteger(parts[0]);
            BigInteger b = new BigInteger(parts[1]);
            BigInteger c = new BigInteger(parts[2]);
            BigInteger d = new BigInteger(parts[3]);
            System.out.print(a.negate().multiply(b).add(c).subtract(d));
        } catch (Exception e) {
            System.out.println("Cannot parse a big integer value");
            e.printStackTrace();
        }
    }
}