package com.journaldev.mooc;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-11
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到慕课网", "admin", new Date());
        Notice notice2 = new Notice(2, "请按时提交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);
        System.out.println("公告内容为");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i+1+ ((Notice)noticeList.get(i)).getTitle());
        }

//        在指定位置添加新公告
        Notice notice4 = new Notice(4, "我是新公告通知", "老师", new Date());
        noticeList.add(1, notice4);
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ((Notice) noticeList.get(i)).getTitle());
        }

//        删除指定的公告（按时完成作业那条）
//        noticeList.remove(2);
        noticeList.remove(notice2);
        System.out.println("删除指定的公告（按时完成作业那条）后：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ((Notice) noticeList.get(i)).getTitle());
        }

//修改指定公告内容，我是新公告改为，修改后的公告
        notice4.setTitle("修改后的公告");
//         noticeList.set(2, notice4);
        System.out.println("修改指定的公告  我是新公告改为，修改后的公告 ");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ((Notice) noticeList.get(i)).getTitle());
        }

    }
}
