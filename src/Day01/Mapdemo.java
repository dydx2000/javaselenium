package Day01;

import java.util.HashMap;
import java.util.Set;

public class Mapdemo {
    public static void main(String[] args) {
//创建 map对象
        HashMap<String, String> map = new HashMap<String, String>();

//添加元素到集合
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        System.out.println(map);

//String remove(String key)
        System.out.println(map.remove("邓超"));
        System.out.println(map);

// 想要查看 黄晓明的媳妇 是谁
        System.out.println(map.get("黄晓明"));
        System.out.println(map.get("邓超"));


        //创建Map集合对象
        HashMap<String, String> map2 = new HashMap<String,String>();
        //添加元素到集合
        map2.put("胡歌", "霍建华");
        map2.put("郭德纲", "于谦");
        map2.put("薛之谦", "大张伟");

        //获取所有的键 获取键集
        Set<String> keys = map2.keySet(); // 遍历键集 得到 每一个键
        for (String key : keys) {
            //key 就是键 //获取对应值
            String value = map2.get(key);
            System.out.println(key+"的CP是："+value);
        }



    }
}
