import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        int[] count = {-1};
        Supplier<Integer> sup = () -> ++count[0];
        return sup;
    }

}