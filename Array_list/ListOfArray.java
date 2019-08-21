package Array_list;

import java.util.ArrayList;
import java.util.List;

public class ListOfArray {
    public static void main(String[] args) {
        ListOfArray obj = new ListOfArray();
        obj.nameoffrnd();
        obj.Namewiththeindexnum('t');
    }

    public List<String> nameoffrnd() {
        List<String> friendlist = new ArrayList<>();
        friendlist.add("rahul");
        friendlist.add("mohibul");
        friendlist.add("tohid");
        friendlist.add("onik");
        // System.out.println(friendlist);


        for (int i = 0; i < friendlist.size(); i++) {
            //  System.out.println(i);

        }
        return friendlist;
    }

    public void Namewiththeindexnum(char name) {
        for (int i = 0; i < nameoffrnd().size(); i++) {
            String yes = nameoffrnd().get(i);
            if (yes.charAt(0) == name) {
                System.out.println("The name of the friend is " + yes + " And the index is " + i);
            }
        }
    }









}