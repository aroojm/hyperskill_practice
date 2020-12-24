import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
//            list.sort(order);
//            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
            minMaxConsumer.accept(list.stream().min(order).orElse(null),
                    list.stream().max(order).orElse(null));
        }
    }
}