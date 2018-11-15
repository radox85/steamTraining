
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Long> list = Arrays.asList(10L, 25L, 2488L, 0L, 3L, 9L);
        System.out.println("Max long element: " + TaskLongs.findMaxElement(list));
        System.out.println("Min long element: " + TaskLongs.findMinElement(list));
        System.out.println("Medianaof list: " + TaskLongs.findMedianElement(list));
        System.out.println("Longs Greater Then: " + TaskLongs.countLongsGreaterThen(list, 24));

        int[] array = new int[]{5, 8, 99, 1, 1, 66, 9};
        System.out.println("Max int in array: " + TaskInts.findMaxElement(array));
        System.out.println("Min int in array: " + TaskInts.findMinElement(array));
        System.out.println("Min int in array on x possitions: " + TaskInts.findMinElemena(array, 3));
        System.out.println("Sum of array: " + TaskInts.sum(array));

        List<Integer> list1 = Arrays.asList(2, 2, 2, 2, 15, 0, 30);
        ArrayList arrayList = TaskLists.removeDuplicates(list1);
        System.out.println("Removind duplicates...");
        TaskLists.printList(arrayList);
        List<String> listString = Arrays.asList("ala", "ma", "kota", "ale","nie","ma","psa");
        //System.out.println(TaskLists.concatenateStrings(listString));
        //List prefixList = TaskLists.filterByPrefix(listString, "al");
        List prefixList  = TaskLists.filterBySuffix(listString,"ma");
        //System.out.println(TaskLists.concatenateStrings(prefixList));


    }
}
