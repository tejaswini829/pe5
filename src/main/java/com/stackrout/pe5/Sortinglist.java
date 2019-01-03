import java.util.*;

class Set_Comparator implements Comparator<String> {
    public int compare(String str1, String str2)
    {
        return str1.compareTo(str2);
    }
}
public class Sortinglist {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("Harry");
        set.add("Olive");
        set.add("Eugene");
        set.add("Alice");
        set.add("Bluto");
        System.out.println(set.toString());
        System.out.println(sortSet(set).toString());
        System.out.println(new ArrayList<String>(sortSet(set)).toString());
    }
    public static TreeSet<String> sortSet(HashSet<String> set){
        TreeSet<String> tree_set = new TreeSet<String>(new Set_Comparator());
        tree_set.addAll(set);
        return tree_set;
    }
}
