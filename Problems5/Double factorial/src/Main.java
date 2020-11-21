import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger one = BigInteger.ONE;
        if (n == 0 | n == 1) {
            return one;
        }
        int i = 1;
        BigInteger k = one;
        if (n % 2 == 0) {
            i = 0;
        }
        while (i < n) {
            i += 2;
            k = k.multiply(BigInteger.valueOf(i));
        }
        return k;
    }
}