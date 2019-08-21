package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Map_Hash {
    public static void main(String[] args) {
        //Hashmap can contain two value also it does't take same key

        Map<String,String> joy = new HashMap<>();
        joy.put("myname","midul");
        joy.put("mydadname","mojahid");
        joy.put("I got ","one sister ");
        System.out.println(joy);
    }
}
