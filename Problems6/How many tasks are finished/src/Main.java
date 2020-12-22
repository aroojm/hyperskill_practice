import java.util.*;
import java.util.concurrent.*;


class FutureUtils {

    public static int howManyIsDone(List<Future> items) {
        int count = 0;
        for (Future f : items) {
            if (f.isDone()) {
                count++;
            }
        }
        return count;
    }

}