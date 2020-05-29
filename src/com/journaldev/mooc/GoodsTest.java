package com.journaldev.mooc;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-15
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class GoodsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Goods> goodsMap = new HashMap<String, Goods>();
        System.out.println("请输入3条商品信息：");
        int i=0;
        while (i < 3) {
            System.out.println("请输入第" + i + 1 + "条商品信息：");
            System.out.println("请输入商品编号：");
            String goodId = scanner.next();
            if (goodsMap.containsKey(goodId)) {
                System.out.println("商品编号重复，请重新输入");
                continue;
            }
            System.out.println("请输入商品名称：");
            String goodName = scanner.next();
            System.out.println("请输入商品价格：");
            double goodPrice=0;
            try {
                 goodPrice = scanner.nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("商品价格格式输入错误，请重新输入");
                scanner.next();
                continue;
            }
            Goods goods = new Goods(goodId, goodName, goodPrice);
            goodsMap.put(goodId, goods);
            i++;
        }
        Iterator<Goods> goodsIterator = goodsMap.values().iterator();
        while (goodsIterator.hasNext()) {
            System.out.println(goodsIterator.next());
        }
    }
}
