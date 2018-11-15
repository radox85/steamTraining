import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TaskLists {
    /*
Zaimplementuj metodę groupByLevelValue tak, aby zwracała mapę, w której kluczem będzie numer zapisany po słowie "Level-",
a wartością będzie lista obiektów typu String zaczynająca się od tego levelu. Obiekty, które nie zaczynają się od słowa "Level"
powinny zostać pominięte.
     */
    public static void printList(List list) {
        for (Object l : list) {
            System.out.print(l + "\t");
        }
        System.out.println();
    }

    public static ArrayList removeDuplicates(List list) {
        return new ArrayList(new HashSet(list));
    }

    public static String concatenateStrings(List list) {
        return list.stream().collect(Collectors.joining()).toString();
    }

    public static List filterByPrefix(List<String> list, String prefix) {
        return list.stream().filter(x -> x.startsWith(prefix)).collect(Collectors.toList());
    }
    public static List filterBySuffix(List<String> list, String prefix) {
        return list.stream().filter(x -> x.endsWith(prefix)).collect(Collectors.toList());
    }




}
