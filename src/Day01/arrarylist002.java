package Day01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class arrarylist002 {

    public static void main(String[] args) {
        ArrayList<String> list1;
        list1 = new ArrayList<>();
        list1.add("hello, ");
        list1.add("cao ni ma,");
        list1.add("java 大爷！");
        list1.add("java 大爷！");
        System.out.println(list1.size());

        //迭代
        for(String list:list1){
            System.out.print(list);
        }
        System.out.println();
        //for 循环
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }

        /* while iterator
         *
         *
         *
         */
        System.out.println();
        Iterator it = list1.iterator();
        while(it.hasNext()){
            System.out.print(it.next());

        }

    }


    }

