package com.journaldev.access;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.access
 * @Version:1.0
 */
public class TestA {
    public void methodPublic() {
        methodPrivate();
    }

    protected void methodProtected() {
        methodPrivate();
    }

    void methodDefault() {
        methodPrivate();
    }
    private void methodPrivate() {
    }
}
