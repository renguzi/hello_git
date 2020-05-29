package com.journaldev.access;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.access
 * @Version:1.0
 */
public class TestB {
    public static void main(String[] args) {
        new TestA().methodPublic();
        new TestA().methodProtected();
        new TestA().methodDefault();
    }

    public void methodPublic() {

    }

    protected void methodProtected() {

    }

    void methodDefault() {

    }

    private void methodPrivate() {

    }
}
