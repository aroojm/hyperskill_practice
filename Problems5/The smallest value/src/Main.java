import java.util.Scanner;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger m = s.nextBigInteger();
        System.out.println(findN(m));
    }
    public static int findN(BigInteger m) {
        BigInteger one = BigInteger.ONE;
        if (m.equals(one)) {
            return 0;
        }
        BigInteger n = one;
        int i = 1;
        while (n.compareTo(m) == -1) {
            i++;
            n = n.multiply(BigInteger.valueOf(i));
        }
        return i;
    }
}