import java.util.*;
import java.util.stream.Collectors;

public class TaskLists {

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

    // TODO: 2018-11-16
    public static Map groupByLevelValue(List<String> list) {
        Map<Integer, ArrayList> map = new HashMap();
        for (String position : list) {
            if (position.startsWith("Level-")) {
                map.put((Integer.valueOf(position.substring(6, 8))), new ArrayList<String>());
            }
        }
        for (String position : list) {
            if (position.startsWith("Level-")) {
                map.get((Integer.valueOf(position.substring(6, 8)))).add(position.substring(9));
            }
        }
        return map;
        // return list.stream().filter(x-> x.startsWith("Level-")).map
    }


}
