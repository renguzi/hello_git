package com.journaldev.mooc;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-15
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String, String> stringStringMap=new HashMap<>();
        System.out.println("请输入3组单词到map中");
        Scanner scanner=new Scanner(System.in);
        int i=0;
        while ( i < 3) {
            System.out.println("请输入单词");
            String key = scanner.next();
            System.out.println("请输入解释");
            String value = scanner.next();
            stringStringMap.put(key, value);
            i++;
        }

        System.out.println(stringStringMap);
        Iterator iterator = stringStringMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Set<Map.Entry<String, String>> entrySet = stringStringMap.entrySet();
        System.out.println(entrySet);

        for (Map.Entry<String, String> entry:entrySet
             ) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//        通过单词找到注释并输出
        System.out.println("输入要查找的单词：");
        String s = scanner.next();
        String v = stringStringMap.get(s);
        Collection<String> values = stringStringMap.values();
        boolean flag=false;
        Iterator<String> stringIterator = values.iterator();
        while (stringIterator.hasNext()) {
            if ((stringIterator.next()).equals(v)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("找到了：");
            System.out.println(s + "的意思是：" + v);
        } else {
            System.out.println("没找到");
        }



    }
}
