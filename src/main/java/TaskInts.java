import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;


public class TaskInts {

    public static Integer findMaxElement(int[] array){
        return Arrays.stream(array).max().orElse(-1);
    }
    public static Integer findMinElement(int[] array){
        return Arrays.stream(array).min().orElse(-1);
    }
    public static Integer findMinElemena(int[] array, int skippedAmount){
        return Arrays.stream(array).sorted().skip(skippedAmount-1).findFirst().orElse(-1);
    }
    public static Integer sum(int[] array){
        return Arrays.stream(array).sum();
    }


}

