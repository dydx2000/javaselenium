package Day01;

import java.util.HashSet;

public class set001 {
    public static void main(String[] args) {
        HashSet<String> set01 = new HashSet<String>();
        set01.add("dada");
        set01.add(" sha");
        set01.add(" zhu");
        set01.add(" cai");
//        set01.add(" cai");

        System.out.println(set01);
        for (String set : set01) {
            System.out.print(set);
        }

        //demo01
        System.out.println();

        demo1();
    }

    public static void demo1() {
        HashSet<String> hs = new HashSet<>();   //创建HashSet对象
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");       //当向set集合中存储重复元素的时候返回为false

        hs.add("b");
        hs.add("c");
        hs.add("d");
        System.out.print(hs);         //[d, b, c, a] 存取无序 并且去掉了重复元素
        System.out.print(b1);         //true
        System.out.print(b2);         //false

        for (String string : hs) {      //只要能用迭代器迭代的,就可以使用增强for循环遍历
            System.out.print(string);
        }
    }
}