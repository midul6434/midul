package Array_list;

import java.util.ArrayList;
import java.util.List;

public class ArryList {
    public static void main(String[] args) {
        ArryList obj = new ArryList();
        obj.Girlsname();
        obj.getthenamefromindex('m');
    }

public List<String> Girlsname() {
    List<String> Girlfriend = new ArrayList<>();
    Girlfriend.add("meem");
    Girlfriend.add("ema");
    Girlfriend.add("saaj");
    Girlfriend.add("siviya");

    for (int i = 0; i < Girlfriend.size() ; i++) {
       // System.out.println(i + " " + Girlfriend.get(i));


    }

    return Girlfriend;
}


    public void getthenamefromindex(char no){
        for(int i =0; i<Girlsname().size();i++){
            String boy = Girlsname().get(i);
            if(boy.charAt(0)==no){
                System.out.println("The name of the girl is " + boy+ " And the index number is " + i);

            }









        }
    }
























}
