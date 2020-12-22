import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> {
        if (x == y) {
            return x;
        } else if (x == 0) {
            return 0;
        } else {
            long product = 1;
            for (long i = x; i <= y ; i++) {
                product *= i;
            }
            return product;
        }
    };
}