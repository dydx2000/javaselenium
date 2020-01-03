package Day01;

import java.util.ArrayList;

public class arrarylist002 {

    public static void main(String[] args) {
        ArrayList<String> list1;
        list1 = new ArrayList<String>();
        list1.add("hello, ");
        list1.add("cao ni ma");


        for(String list:list1){
            System.out.print(list);
        }
    }
}
