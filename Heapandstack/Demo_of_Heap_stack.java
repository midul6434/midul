package Heapandstack;

import java.util.HashMap;
import java.util.Map;

public class Demo_of_Heap_stack {
    //Java Heap space is used by java runtime to allocate memory to Objects and JRE classes. Whenever we create any object, it’s always created in the Heap space.
    //Stack memory is always referenced in LIFO (Last-In-First-Out) order. Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method.
    public static void main(String[] args) {
        Map<String,Integer> midul = new HashMap<>();
        midul.put("result",90);
        midul.put("car",30000);
        midul.put("bike",500);
        midul.put("macbook",2650);
        System.out.println(midul.get("result"));
        System.out.println(midul.replace("car" , 400000 ));
        System.out.println(midul);
    }




}
