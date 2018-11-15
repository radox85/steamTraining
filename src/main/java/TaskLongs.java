import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.LongStream;

public class TaskLongs {

    public static Long findMaxElement(List<Long> list) {
        return list.stream().mapToLong(x -> x).max().getAsLong();
    }

    public static Long findMinElement(List<Long> list) {
        return list.stream().mapToLong(x -> x).min().getAsLong();
    }

    public static Long findMedianElement(List<Long> list) {
        Long mediana = 0L;
        LongStream sorted = list.stream().mapToLong(x -> x).sorted();
        return (list.size() % 2 == 0) ? sorted.skip((list.size() / 2) - 1).findFirst().getAsLong() : sorted.skip(list.size() / 2).findFirst().getAsLong();
    }

    public static Integer countLongsGreaterThen(List<Long> list, int minValue) {
        return (int) list.stream().mapToLong(x -> x).filter(x -> x > minValue).count();
    }

}
