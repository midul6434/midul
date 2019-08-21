import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Studentlist {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("joy",1);
        hm.put("rahul",2);
        hm.put("apurbo",3);
        hm.put("lisa",4);
        System.out.println(hm.containsValue(5));

    }
}
