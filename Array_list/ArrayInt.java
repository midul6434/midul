package Array_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayInt {
    public static void main(String[] args) {
        ArrayInt obj = new ArrayInt();
        obj.student();
    }

    public List<Integer> student() {
        List<Integer> result = new ArrayList<>();
        result.add(300);
        result.add(500);
        result.add(350);
        result.add(600);
        result.add(300);

        HashSet<Integer> man = new HashSet<>(result);
        System.out.println(man);

        //System.out.println(result);
        //for(int i = 0;i<result.size();i++){
        //System.out.println(result.get(i));

return result;
    }

            }







