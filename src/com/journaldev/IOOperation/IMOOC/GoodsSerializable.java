package com.journaldev.IOOperation.IMOOC;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-22
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class GoodsSerializable {
    public static void main(String[] args) {
        Goods goods = new Goods("01", "电脑", 5999);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/asher/imooc/imooc.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/imooc/imooc.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //            把对象信息goods写入文件
            objectOutputStream.writeObject(goods);
            objectOutputStream.writeBoolean(true);
            objectOutputStream.flush();
            Goods good01;
//            从文本中读取信息
            try {
                good01 = (Goods) objectInputStream.readObject();
                System.out.println(good01);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(objectInputStream.readBoolean());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
