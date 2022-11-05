import java.util.*;

public class Latihan2 {
    public static List<String> reverse(List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }
    
    public static List<String> randList(List<String> list) {
        List<String> result = new ArrayList<>();
        Random rand = new Random();
        while (list.size() > 0) {
            int index = rand.nextInt(list.size());
            result.add(list.get(index));
            list.remove(index);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zero");
        list.add("Alpha");
        list.add("Kilo");
        list.add("Indonesia");

        System.out.println("List: " + list);
        System.out.println("Reverse List: " + reverse(list));
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        System.out.println("Random List: " + randList(list));
    }
}