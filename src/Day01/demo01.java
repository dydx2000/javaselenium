package Day01;


import java.util.ArrayList;

public class demo01 {
    public static void main(String[] args) {
        for (int i =0;i<100 ;i+=25){
            System.out.println((i+1)+"咬死你!");
            System.out.println();
            String hello2 = "hello";
            if (hello2 != null) {

            }
            try {
                hello2.toCharArray();
            } catch (Exception e) {
                e.printStackTrace();
            }

            //创建列表
            ArrayList list = new ArrayList();
            list.add("we");
            list.add("are");
            list.add("family");

            System.out.println(list.size());




            for (int i1 = 0; i1 < list.size(); i1++) {
                System.out.print(list.get(i1)+" ");
            }





        }


    }
}
