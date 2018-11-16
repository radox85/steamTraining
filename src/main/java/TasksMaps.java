import java.util.*;

public class TasksMaps {
    /*
Zaimplementuj metodę flattenNoDuplicates tak, aby zwracała wszystkie listy będące wartościami mapy jako jedną listę.
Lista powinna usunąć duplikaty.
     */

    public static List flattenPreserveDuplicates(HashMap<Integer, ArrayList> map) {
        List list = new ArrayList();
        for (Map.Entry<Integer, ArrayList> entiers : map.entrySet()) {
            list.add(entiers.getValue());
        }
        return list;
    }

    // TODO: 2018-11-16  
    public static List flattenNoDuplicates(HashMap<Integer, ArrayList> map) {
        List list = new ArrayList();
        for (Map.Entry<Integer, ArrayList> entiers : map.entrySet()) {
            list.add(entiers.getValue());
        }
        return new ArrayList(new HashSet(list));
    }
}
